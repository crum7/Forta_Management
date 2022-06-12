package com.example.housei_kokusai


import android.content.ContentValues
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.AdapterView.OnItemClickListener
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.*
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


//Fragmentを継承したclassを作る　これがなきゃ始まらない
class zikannwariFriends : Fragment() {

    var navController: NavController?=null
    val db=Firebase.firestore


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
//まずは、こいつでfragment_homeを表示する
        return inflater.inflate(R.layout.fragment_zikannwari_friends, container, false)


    }





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(view)
        val user_name=Firebase.auth.currentUser?.displayName
        val list=requireActivity().findViewById<ListView>(R.id.list_view)
        val button=requireActivity().findViewById<ImageButton>(R.id.button)



        var name = ""
        var name2 = ""

        var tokusyu=""
        var display_name=arrayListOf("}")
        var real_name=arrayListOf("}")



        db.collection("users_profile").document("$user_name").collection("admit_friends")
            .get()
            .addOnSuccessListener { result ->



                for (document in result) {
                    Log.d(TAG , "${document.id} => ${document.data}")


                    name=document.data.toString().replace(Regex("[={}*]") , "").replace("name","")



                    //nameを使って、display_nameを探して、表示する
                    db.collection("users_profile").document(name)
                        .get()
                        .addOnSuccessListener { documents ->


                            name = document.data.toString().replace(Regex("[={}*]") , "").replace("name","")
                            display_name.add(name)


                            val adapter=ArrayAdapter<String>(
                                requireContext() ,
                                android.R.layout.simple_list_item_1,
                                display_name//本番環境ではhyouzi_array
                            )

                            list.setAdapter(adapter)

                            //ここをnameにすると、forループの中だからおかしくなる。
                            name2 = document.id.toString().replace(Regex("[={}*]") , "").replace("name","")
                            real_name.add(name2)




                            display_name.remove("}")
                            real_name.remove("}")



                            list.setOnItemClickListener { adapterView, view, position, id ->
                                //safe argsによる　friendsからFriendsDetailにデータ渡し
                                //https://qiita.com/m-coder/items/3a8e66d49f2830b09bf4
                                //real_nameには、ユーザーネームが配列で格納されているのでそれをpositionで設定してる


                                val Bundle=bundleOf("NameKey" to real_name[position])
                                view.findNavController()
                                    .navigate(R.id.action_zikannwariFriends_to_zikannwariFriendsDetail, Bundle)






                            }


                        }
                }


















}








        //友達検索のフラグメントに移行する
        button.setOnClickListener{
            view.findNavController().navigate(R.id.action_zikannwariFriends_to_friendskennsaku)
        }




    }
}
























