package com.example.housei_kokusai

import android.app.AlertDialog
import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import androidx.annotation.WorkerThread
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.Tasks
import com.google.firebase.Timestamp
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FieldPath
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.google.firebase.firestore.MetadataChanges
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.ServerTimestamp
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.Source
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.firestoreSettings
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import java.util.ArrayList
import java.util.Date
import java.util.HashMap
import java.util.concurrent.Callable
import java.util.concurrent.Executor
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit
import kotlin.reflect.typeOf


class settings_name : Fragment() {


    private lateinit var database: DatabaseReference
    val db=Firebase.firestore

    override fun onCreateView(
        inflater: LayoutInflater , container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings_name , container , false)
    }


    override fun onViewCreated(view: View , savedInstanceState: Bundle?) {
        super.onViewCreated(view , savedInstanceState)


        lateinit var auth: FirebaseAuth


        //val ref = database.getReference()
        auth=Firebase.auth

        //自分の名前
        val user_name=Firebase.auth.currentUser?.displayName.toString()


        val nowname=requireActivity().findViewById<TextView>(R.id.nowname)


        db.collection("users_profile").document(user_name)
            .get()
            .addOnSuccessListener { result ->
                nowname.setText(result.data.toString().replace(Regex("[={}*]") , "")
                    .replace("display_name" , ""))

            }




        //名前変更
        val button=view.findViewById<Button>(R.id.save_button_name)
        val changeName=requireActivity().findViewById<EditText>(R.id.changeName)



        button.setOnClickListener {

            val willName=changeName.text.toString()


            val custom_name=hashMapOf(
                "display_name" to willName ,

                )

            val custom_name_others=hashMapOf(
                "name" to willName ,

                )


            //自分のところのdisplay_nameの更新
            db.collection("users_profile").document("$user_name")
                .update(custom_name as Map<String , Any>)


            //他の人のblock_list・admit_friends・watch_byのところのnameを変更
            //ここが一番データ食う

            db.collection("users_profile")
                .get()
                .addOnSuccessListener { result ->

                    for (document in result) {

                        db.collection("users_profile").document(document.id).collection("watch_by")
                            .document(user_name)
                            .update(custom_name_others as Map<String , Any>)

                        db.collection("users_profile").document(document.id)
                            .collection("admit_friends").document(user_name)
                            .update(custom_name_others as Map<String , Any>)

                        db.collection("users_profile").document(document.id)
                            .collection("block_list").document(user_name)
                            .update(custom_name_others as Map<String , Any>)
                    }
                }
        }
    }
}





