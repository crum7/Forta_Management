package com.example.housei_kokusai

import android.content.ContentValues.TAG
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlin.reflect.typeOf


class zikannwariFriendsDetail : Fragment() {
    var navController: NavController? = null
    val db = Firebase.firestore

    override fun onCreateView(
        inflater: LayoutInflater ,
        container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_zikannwari_friends_detail,container ,false)
    }

    override fun onViewCreated(view: View ,savedInstanceState: Bundle?) {
        super.onViewCreated(view ,savedInstanceState)

        navController = Navigation.findNavController(view)



        //TextView
        val Getuyou1_txt  = requireActivity().findViewById<TextView>(R.id.Getuyou_1_friends)
        val Getuyou2_txt  = requireActivity().findViewById<TextView>(R.id.Getuyou_2_friends)
        val Getuyou3_txt  = requireActivity().findViewById<TextView>(R.id.Getuyou_3_friends)
        val Getuyou4_txt  = requireActivity().findViewById<TextView>(R.id.Getuyou_4_friends)
        val Getuyou5_txt  = requireActivity().findViewById<TextView>(R.id.Getuyou_5_friends)
        val Getuyou6_txt  = requireActivity().findViewById<TextView>(R.id.Getuyou_6_friends)

        val Kayou1_txt  = requireActivity().findViewById<TextView>(R.id.Kayou_1_friends)
        val Kayou2_txt  = requireActivity().findViewById<TextView>(R.id.Kayou_2_friends)
        val Kayou3_txt  = requireActivity().findViewById<TextView>(R.id.Kayou_3_friends)
        val Kayou4_txt  = requireActivity().findViewById<TextView>(R.id.Kayou_4_friends)
        val Kayou5_txt  = requireActivity().findViewById<TextView>(R.id.Kayou_5_friends)
        val Kayou6_txt  = requireActivity().findViewById<TextView>(R.id.Kayou_6_friends)

        val Suiyou1_txt  = requireActivity().findViewById<TextView>(R.id.Suiyou_1_friends)
        val Suiyou2_txt  = requireActivity().findViewById<TextView>(R.id.Suiyou_2_friends)
        val Suiyou3_txt  = requireActivity().findViewById<TextView>(R.id.Suiyou_3_friends)
        val Suiyou4_txt  = requireActivity().findViewById<TextView>(R.id.Suiyou_4_friends)
        val Suiyou5_txt  = requireActivity().findViewById<TextView>(R.id.Suiyou_5_friends)
        val Suiyou6_txt  = requireActivity().findViewById<TextView>(R.id.Suiyou_6_friends)

        val Mokuyou1_txt  = requireActivity().findViewById<TextView>(R.id.Mokuyou_1_friends)
        val Mokuyou2_txt  = requireActivity().findViewById<TextView>(R.id.Mokuyou_2_friends)
        val Mokuyou3_txt  = requireActivity().findViewById<TextView>(R.id.Mokuyou_3_friends)
        val Mokuyou4_txt  = requireActivity().findViewById<TextView>(R.id.Mokuyou_4_friends)
        val Mokuyou5_txt  = requireActivity().findViewById<TextView>(R.id.Mokuyou_5_friends)
        val Mokuyou6_txt  = requireActivity().findViewById<TextView>(R.id.Mokuyou_6_friends)

        val Kinyou1_txt  = requireActivity().findViewById<TextView>(R.id.Kinyou_1_friends)
        val Kinyou2_txt  = requireActivity().findViewById<TextView>(R.id.Kinyou_2_friends)
        val Kinyou3_txt  = requireActivity().findViewById<TextView>(R.id.Kinyou_3_friends)
        val Kinyou4_txt  = requireActivity().findViewById<TextView>(R.id.Kinyou_4_friends)
        val Kinyou5_txt  = requireActivity().findViewById<TextView>(R.id.Kinyou_5_friends)
        val Kinyou6_txt  = requireActivity().findViewById<TextView>(R.id.Kinyou_6_friends)





        val Name_KEY = arguments?.getString("NameKey").toString()

        val Getuyou1 =
            db.collection("users_data").document(Name_KEY).collection("Getuyou1").document("*")
        val Getuyou2 =
            db.collection("users_data").document(Name_KEY).collection("Getuyou2").document("*")
        val Getuyou3 =
            db.collection("users_data").document(Name_KEY).collection("Getuyou3").document("*")
        val Getuyou4 =
            db.collection("users_data").document(Name_KEY).collection("Getuyou4").document("*")
        val Getuyou5 =
            db.collection("users_data").document(Name_KEY).collection("Getuyou5").document("*")
        val Getuyou6 =
            db.collection("users_data").document(Name_KEY).collection("Getuyou6").document("*")


        val  Kayou1 =
            db.collection("users_data").document(Name_KEY).collection("Kayou1").document("*")
        val Kayou2 =
            db.collection("users_data").document(Name_KEY).collection("Kayou2").document("*")
        val Kayou3 =
            db.collection("users_data").document(Name_KEY).collection("Kayou3").document("*")
        val Kayou4 =
            db.collection("users_data").document(Name_KEY).collection("Kayou4").document("*")
        val Kayou5 =
            db.collection("users_data").document(Name_KEY).collection("Kayou5").document("*")
        val Kayou6 =
            db.collection("users_data").document(Name_KEY).collection("Kayou6").document("*")


        val  Suiyou1 =
            db.collection("users_data").document(Name_KEY).collection("Suiyou1").document("*")
        val Suiyou2 =
            db.collection("users_data").document(Name_KEY).collection("Suiyou2").document("*")
        val Suiyou3 =
            db.collection("users_data").document(Name_KEY).collection("Suiyou3").document("*")
        val Suiyou4 =
            db.collection("users_data").document(Name_KEY).collection("Suiyou4").document("*")
        val Suiyou5 =
            db.collection("users_data").document(Name_KEY).collection("Suiyou5").document("*")
        val Suiyou6 =
            db.collection("users_data").document(Name_KEY).collection("Suiyou6").document("*")


        val  Mokuyou1 =
            db.collection("users_data").document(Name_KEY).collection("Mokuyou1").document("*")
        val Mokuyou2 =
            db.collection("users_data").document(Name_KEY).collection("Mokuyou2").document("*")
        val Mokuyou3 =
            db.collection("users_data").document(Name_KEY).collection("Mokuyou3").document("*")
        val Mokuyou4 =
            db.collection("users_data").document(Name_KEY).collection("Mokuyou4").document("*")
        val Mokuyou5 =
            db.collection("users_data").document(Name_KEY).collection("Mokuyou5").document("*")
        val Mokuyou6 =
            db.collection("users_data").document(Name_KEY).collection("Mokuyou6").document("*")



        val  Kinyou1 =
            db.collection("users_data").document(Name_KEY).collection("Kinyou1").document("*")
        val Kinyou2 =
            db.collection("users_data").document(Name_KEY).collection("Kinyou2").document("*")
        val Kinyou3 =
            db.collection("users_data").document(Name_KEY).collection("Kinyou3").document("*")
        val Kinyou4 =
            db.collection("users_data").document(Name_KEY).collection("Kinyou4").document("*")
        val Kinyou5 =
            db.collection("users_data").document(Name_KEY).collection("Kinyou5").document("*")
        val Kinyou6 =
            db.collection("users_data").document(Name_KEY).collection("Kinyou6").document("*")


        val Getuyou1Items = arrayListOf("")
        val Getuyou2Items = arrayListOf("")
        val Getuyou3Items = arrayListOf("")
        val Getuyou4Items = arrayListOf("")
        val Getuyou5Items = arrayListOf("")
        val Getuyou6Items = arrayListOf("")
        val Getuyou7Items = arrayListOf("")

        val Kayou1Items = arrayListOf("")
        val Kayou2Items = arrayListOf("")
        val Kayou3Items = arrayListOf("")
        val Kayou4Items = arrayListOf("")
        val Kayou5Items = arrayListOf("")
        val Kayou6Items = arrayListOf("")
        val Kayou7Items = arrayListOf("")

        val Suiyou1Items = arrayListOf("")
        val Suiyou2Items = arrayListOf("")
        val Suiyou3Items = arrayListOf("")
        val Suiyou4Items = arrayListOf("")
        val Suiyou5Items = arrayListOf("")
        val Suiyou6Items = arrayListOf("")
        val Suiyou7Items = arrayListOf("")


        val Mokuyou1Items = arrayListOf("")
        val Mokuyou2Items = arrayListOf("")
        val Mokuyou3Items = arrayListOf("")
        val Mokuyou4Items = arrayListOf("")
        val Mokuyou5Items = arrayListOf("")
        val Mokuyou6Items = arrayListOf("")
        val Mokuyou7Items = arrayListOf("")

        val Kinyou1Items = arrayListOf("")
        val Kinyou2Items = arrayListOf("")
        val Kinyou3Items = arrayListOf("")
        val Kinyou4Items = arrayListOf("")
        val Kinyou5Items = arrayListOf("")
        val Kinyou6Items = arrayListOf("")
        val Kinyou7Items = arrayListOf("")

        //教科
        val japanese = arrayOf("現代文B3","現代文B3 413","あ")
        val math = arrayOf("数学Ⅲ 241")
        val english = arrayOf("コミュ英 243")
        val science = arrayOf("化学")
        val social = arrayOf("現代社会 431")
        val other = arrayOf("HR 231","体育１　体育館")


        var subject=""


        Getuyou1.get()
            .addOnSuccessListener { document ->
                if (document != null) {

                    subject = document.data.toString().replace(Regex("[={}*]"), "")
                        .replace("Getuyou1", "")


                    Getuyou1_txt.setText(subject)
                    
                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Getuyou1_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Getuyou1_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Getuyou1_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Getuyou1_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Getuyou1_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Getuyou1_txt.setBackgroundResource(R.drawable.other)
                    }


                }






            }


        Getuyou2.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Getuyou2","")
                    Getuyou2_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Getuyou2_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Getuyou2_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Getuyou2_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Getuyou2_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Getuyou2_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Getuyou2_txt.setBackgroundResource(R.drawable.other)
                    }
                }
            }

        Getuyou3.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Getuyou3","")
                    Getuyou3_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Getuyou3_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Getuyou3_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Getuyou3_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Getuyou3_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Getuyou3_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Getuyou3_txt.setBackgroundResource(R.drawable.other)
                    }
                    
                }
            }

        Getuyou4.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Getuyou4","")
                    Getuyou4_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Getuyou4_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Getuyou4_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Getuyou4_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Getuyou4_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Getuyou4_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Getuyou4_txt.setBackgroundResource(R.drawable.other)
                    }
                    
                }
            }

        Getuyou5.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Getuyou5","")
                    Getuyou5_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Getuyou5_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Getuyou5_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Getuyou5_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Getuyou5_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Getuyou5_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Getuyou5_txt.setBackgroundResource(R.drawable.other)
                    }
                    
                }
            }
        Getuyou6.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Getuyou6","")
                    Getuyou6_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Getuyou6_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Getuyou6_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Getuyou6_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Getuyou6_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Getuyou6_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Getuyou6_txt.setBackgroundResource(R.drawable.other)
                    }
                    
                }
            }

        
        
        
        
        
        
        
        Kayou1.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kayou1","")
                    Kayou1_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kayou1_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kayou1_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kayou1_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                       Kayou1_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kayou1_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kayou1_txt.setBackgroundResource(R.drawable.other)
                    }


                }
            }


        Kayou2.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kayou2","")
                    Kayou2_txt.setText(subject)



                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kayou2_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kayou2_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kayou2_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kayou2_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kayou2_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kayou2_txt.setBackgroundResource(R.drawable.other)
                    }


                }
            }

        Kayou3.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kayou3","")
                    Kayou3_txt.setText(subject)



                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kayou3_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kayou3_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kayou3_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kayou3_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kayou3_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kayou3_txt.setBackgroundResource(R.drawable.other)
                    }

                }
            }

        Kayou4.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kayou4","")
                    Kayou4_txt.setText(subject)



                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kayou4_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kayou4_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kayou4_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kayou4_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kayou4_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kayou4_txt.setBackgroundResource(R.drawable.other)
                    }


                }
            }

        Kayou5.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kayou5","")
                    Kayou5_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kayou5_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kayou5_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kayou5_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kayou5_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kayou5_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kayou5_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }
        Kayou6.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kayou6","")
                    Kayou6_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kayou6_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kayou6_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kayou6_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kayou6_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kayou6_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kayou6_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }





        Suiyou1.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Suiyou1","")
                    Suiyou1_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                       Suiyou1_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Suiyou1_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Suiyou1_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Suiyou1_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Suiyou1_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Suiyou1_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }


        Suiyou2.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Suiyou2","")
                    Suiyou2_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Suiyou2_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Suiyou2_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Suiyou2_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Suiyou2_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Suiyou2_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Suiyou2_txt.setBackgroundResource(R.drawable.other)
                    }


                }
            }

        Suiyou3.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Suiyou3","")
                    Suiyou3_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Suiyou3_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Suiyou3_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Suiyou3_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Suiyou3_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Suiyou3_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Suiyou3_txt.setBackgroundResource(R.drawable.other)
                    }


                }
            }

        Suiyou4.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Suiyou4","")
                    Suiyou4_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Suiyou4_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Suiyou4_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Suiyou4_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Suiyou4_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Suiyou4_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Suiyou4_txt.setBackgroundResource(R.drawable.other)
                    }


                }
            }

        Suiyou5.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Suiyou5","")
                    Suiyou5_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Suiyou5_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Suiyou5_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Suiyou5_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Suiyou5_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Suiyou5_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Suiyou5_txt.setBackgroundResource(R.drawable.other)
                    }


                }
            }
        Suiyou6.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Suiyou6","")
                    Suiyou6_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Suiyou6_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Suiyou6_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Suiyou6_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Suiyou6_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Suiyou6_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Suiyou6_txt.setBackgroundResource(R.drawable.other)
                    }


                }
            }




        Mokuyou1.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Mokuyou1","")
                    Mokuyou1_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Mokuyou1_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Mokuyou1_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Mokuyou1_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Mokuyou1_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Mokuyou1_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Mokuyou1_txt.setBackgroundResource(R.drawable.other)
                    }
                }
            }


        Mokuyou2.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Mokuyou2","")
                    Mokuyou2_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Mokuyou2_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Mokuyou2_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Mokuyou2_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Mokuyou2_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Mokuyou2_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Mokuyou2_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }

        Mokuyou3.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Mokuyou3","")
                    Mokuyou3_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Mokuyou3_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Mokuyou3_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Mokuyou3_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Mokuyou3_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Mokuyou3_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Mokuyou3_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }

        Mokuyou4.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Mokuyou4","")
                    Mokuyou4_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Mokuyou4_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Mokuyou4_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Mokuyou4_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Mokuyou4_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Mokuyou4_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Mokuyou4_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }

        Mokuyou5.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Mokuyou5","")
                    Mokuyou5_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Mokuyou5_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Mokuyou5_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Mokuyou5_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Mokuyou5_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Mokuyou5_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Mokuyou5_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }
        Mokuyou6.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Mokuyou6","")
                    Mokuyou6_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Mokuyou6_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Mokuyou6_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Mokuyou6_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Mokuyou6_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Mokuyou6_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Mokuyou6_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }




        Kinyou1.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kinyou1","")
                    Kinyou1_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kinyou1_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kinyou1_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kinyou1_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kinyou1_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kinyou1_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kinyou1_txt.setBackgroundResource(R.drawable.other)
                    }


                }
            }


        Kinyou2.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kinyou2","")
                    Kinyou2_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kinyou2_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kinyou2_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kinyou2_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kinyou2_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kinyou2_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kinyou2_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }

        Kinyou3.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kinyou3","")
                    Kinyou3_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kinyou3_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kinyou3_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kinyou3_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kinyou3_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kinyou3_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kinyou3_txt.setBackgroundResource(R.drawable.other)
                    }


                }
            }

        Kinyou4.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kinyou4","")
                    Kinyou4_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kinyou4_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kinyou4_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kinyou4_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kinyou4_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kinyou4_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kinyou4_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }

        Kinyou5.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kinyou5","")
                    Kinyou5_txt.setText(subject)


                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kinyou5_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kinyou5_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kinyou5_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kinyou5_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kinyou5_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kinyou5_txt.setBackgroundResource(R.drawable.other)
                    }
                }
            }
        Kinyou6.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val subject = document.data.toString().replace(Regex("[={}*]") , "").replace("Kinyou6","")
                    Kinyou6_txt.setText(subject)

                    //背景色の設定
                    //positionは、選ばれたリストのindex
                    if (japanese.contains(subject)) {

                        Kinyou6_txt.setBackgroundResource(R.drawable.japanese)
                    } else if(math.contains(subject)){
                        Kinyou6_txt.setBackgroundResource(R.drawable.math)
                    }else if(english.contains(subject)){
                        Kinyou6_txt.setBackgroundResource(R.drawable.english)
                    }else if(science.contains(subject)){
                        Kinyou6_txt.setBackgroundResource(R.drawable.science)
                    } else if(social.contains(subject)){
                        Kinyou6_txt.setBackgroundResource(R.drawable.socieal)
                    }else if(other.contains(subject)){
                        Kinyou6_txt.setBackgroundResource(R.drawable.other)
                    }



                }
            }

    }
}