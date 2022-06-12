package com.example.housei_kokusai

import android.content.ContentValues.TAG
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.res.ResourcesCompat.getDrawable
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.housei_kokusai.R.drawable.border
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase



//Fragmentを継承したclassを作る　これがなきゃ始まらない
class tourokuManday_ad: Fragment() {

    var navController: NavController? = null
    val db = Firebase.firestore
    val user_name = Firebase.auth.currentUser?.displayName


    override fun onCreateView(
        inflater: LayoutInflater ,
        container: ViewGroup? ,
        savedInstanceState: Bundle?


    ): View? {
//まずは、こいつでfragment_homeを表示する
        return inflater.inflate(R.layout.fragment_touroku_manday_ad , container , false)


    }


    //SharedPreferencesでデータを永続化!!!
    //わからなくなったら、https://qiita.com/taowata/items/d5cfbd665cceb1dc4974

    override fun onViewCreated(view: View , savedInstanceState: Bundle?) {
        super.onViewCreated(view , savedInstanceState)


        // getSharedPreferencesメソッドでSharedPreferencesオブジェクトを取得
        //Context.MODE_PRIVATEは、他のアプリとデータ共有をしない設定
        val sharedPref1 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref2 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref3 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref4 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref5 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref6 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref7 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref8 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref9 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref10 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref11 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref12 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref13 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref14 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref15 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref16 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref17 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref18 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref19 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref20 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref21 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref22 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref23 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref24 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref25 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref26 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref27 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref28 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref29 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref30 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref31 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref32 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref33 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref34 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)
        val sharedPref35 = requireActivity().getSharedPreferences("ファイル名" , Context.MODE_PRIVATE)


        // getString()を呼び出して保存されている文字列を読み込む
        // まだ保存されていない場合はデフォルトの文字列を返す
        //getString("key名","デフォルトの文字列")
        val savedText1 = sharedPref1.getString("Getuyou1" , "空き")
        val savedText2 = sharedPref2.getString("Getuyou2" , "空き")
        val savedText3 = sharedPref3.getString("Getuyou3" , "空き")
        val savedText4 = sharedPref4.getString("Getuyou4" , "空き")
        val savedText5 = sharedPref5.getString("Getuyou5" , "空き")
        val savedText6 = sharedPref6.getString("Getuyou6" , "空き")
        val savedText7 = sharedPref7.getString("Getuyou7" , "空き")

        val savedText8 = sharedPref8.getString("Kayou1" , "空き")
        val savedText9 = sharedPref9.getString("Kayou2" , "空き")
        val savedText10 = sharedPref10.getString("Kayou3" , "空き")
        val savedText11 = sharedPref11.getString("Kayou4" , "空き")
        val savedText12 = sharedPref12.getString("Kayou5" , "空き")
        val savedText13 = sharedPref13.getString("Kayou6" , "空き")
        val savedText14 = sharedPref14.getString("Kayou7" , "空き")

        val savedText15 = sharedPref15.getString("Suiyou1" , "空き")
        val savedText16 = sharedPref16.getString("Suiyou2" , "空き")
        val savedText17 = sharedPref17.getString("Suiyou3" , "空き")
        val savedText18 = sharedPref18.getString("Suiyou4" , "空き")
        val savedText19 = sharedPref19.getString("Suiyou5" , "空き")
        val savedText20 = sharedPref20.getString("Suiyou6" , "空き")
        val savedText21 = sharedPref21.getString("Suiyou7" , "空き")

        val savedText22 = sharedPref22.getString("Mokuyou1" , "空き")
        val savedText23 = sharedPref23.getString("Mokuyou2" , "空き")
        val savedText24 = sharedPref24.getString("Mokuyou3" , "空き")
        val savedText25 = sharedPref25.getString("Mokuyou4" , "空き")
        val savedText26 = sharedPref26.getString("Mokuyou5" , "空き")
        val savedText27 = sharedPref27.getString("Mokuyou6" , "空き")
        val savedText28 = sharedPref28.getString("Mokuyou7" , "空き")

        val savedText29 = sharedPref29.getString("Kinyou1" , "空き")
        val savedText30 = sharedPref30.getString("Kinyou2" , "空き")
        val savedText31 = sharedPref31.getString("Kinyou3" , "空き")
        val savedText32 = sharedPref32.getString("Kinyou4" , "空き")
        val savedText33 = sharedPref33.getString("Kinyou5" , "空き")
        val savedText34 = sharedPref34.getString("Kinyou6" , "空き")
        val savedText35 = sharedPref35.getString("Kinyou7" , "空き")


        //spinner
        val Getuyou1 = requireActivity().findViewById<Spinner>(R.id.Getuyou_1)
        val Getuyou2 = requireActivity().findViewById<Spinner>(R.id.Getuyou_2)
        val Getuyou3 = requireActivity().findViewById<Spinner>(R.id.Getuyou_3)
        val Getuyou4 = requireActivity().findViewById<Spinner>(R.id.Getuyou_4)
        val Getuyou5 = requireActivity().findViewById<Spinner>(R.id.Getuyou_5)
        val Getuyou6 = requireActivity().findViewById<Spinner>(R.id.Getuyou_6)


        val Kayou1 = requireActivity().findViewById<Spinner>(R.id.Kayou_1)
        val Kayou2 = requireActivity().findViewById<Spinner>(R.id.Kayou_2)
        val Kayou3 = requireActivity().findViewById<Spinner>(R.id.Kayou_3)
        val Kayou4 = requireActivity().findViewById<Spinner>(R.id.Kayou_4)
        val Kayou5 = requireActivity().findViewById<Spinner>(R.id.Kayou_5)
        val Kayou6 = requireActivity().findViewById<Spinner>(R.id.Kayou_6)


        val Suiyou1 = requireActivity().findViewById<Spinner>(R.id.Suiyou_1)
        val Suiyou2 = requireActivity().findViewById<Spinner>(R.id.Suiyou_2)
        val Suiyou3 = requireActivity().findViewById<Spinner>(R.id.Suiyou_3)
        val Suiyou4 = requireActivity().findViewById<Spinner>(R.id.Suiyou_4)
        val Suiyou5 = requireActivity().findViewById<Spinner>(R.id.Suiyou_5)
        val Suiyou6 = requireActivity().findViewById<Spinner>(R.id.Suiyou_6)


        val Mokuyou1 = requireActivity().findViewById<Spinner>(R.id.Mokuyou_1)
        val Mokuyou2 = requireActivity().findViewById<Spinner>(R.id.Mokuyou_2)
        val Mokuyou3 = requireActivity().findViewById<Spinner>(R.id.Mokuyou_3)
        val Mokuyou4 = requireActivity().findViewById<Spinner>(R.id.Mokuyou_4)
        val Mokuyou5 = requireActivity().findViewById<Spinner>(R.id.Mokuyou_5)
        val Mokuyou6 = requireActivity().findViewById<Spinner>(R.id.Mokuyou_6)

        val Kinyou1 = requireActivity().findViewById<Spinner>(R.id.Kinyou_1)
        val Kinyou2 = requireActivity().findViewById<Spinner>(R.id.Kinyou_2)
        val Kinyou3 = requireActivity().findViewById<Spinner>(R.id.Kinyou_3)
        val Kinyou4 = requireActivity().findViewById<Spinner>(R.id.Kinyou_4)
        val Kinyou5 = requireActivity().findViewById<Spinner>(R.id.Kinyou_5)
        val Kinyou6 = requireActivity().findViewById<Spinner>(R.id.Kinyou_6)



        val Getuyou1Items = arrayListOf("現代文B 111" , "日本史B 433" ,"数学Ⅱ発展 223","コミュ英Ⅱ 234","コミュ英Ⅲ 235","現代文A 112","現代社会 441" ,
            "政治経済 432" ,"生物基礎 322","物理研究　332","体育","Intractive Engish 228","英文法Ⅰ　222", "英文法Ⅱ　214" ,"英文読解Ⅱ 216","スペイン語　215",
            "韓国語　221","1C数学α 114","1F数学α 227" )
        val Getuyou2Items = arrayListOf("古典B 111" , "日本史B 432" ,"日本史総合 433","数学Ⅱ基礎 227","数学Ⅲ 228","コミュ英Ⅱ 234","化学")
        val Getuyou3Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Getuyou4Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Getuyou5Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Getuyou6Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")


        val Kayou1Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Kayou2Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Kayou3Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Kayou4Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Kayou5Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Kayou6Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")


        val Suiyou1Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Suiyou2Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Suiyou3Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Suiyou4Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Suiyou5Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Suiyou6Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")



        val Mokuyou1Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Mokuyou2Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Mokuyou3Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Mokuyou4Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Mokuyou5Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Mokuyou6Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")


        val Kinyou1Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Kinyou2Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Kinyou3Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Kinyou4Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Kinyou5Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")
        val Kinyou6Items = arrayListOf("体育１　体育館" , "あ" ,"HR 231","数学Ⅲ 241","現代社会 431","コミュ英 243","化学")



        //教科ごとの色分け
        val japanese = arrayListOf("現代文B3","現代文B3 413","あ")
        val math = arrayListOf("数学Ⅲ 241")
        val english = arrayListOf("コミュ英 243")
        val science = arrayListOf("化学")
        val social = arrayListOf("現代社会 431")
        val other = arrayListOf("HR 231","体育１　体育館","体育１")






        //以前に選択されたものをリストの一番最初に追加
        Getuyou1Items.add(0 , savedText1.toString())

        val adapter1 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Getuyou1Items
        )
        adapter1.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Getuyou1.adapter = adapter1

        // OnItemSelectedListenerの実装
        Getuyou1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Getuyou1_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Getuyou1Items[position])) {
                    Getuyou1.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Getuyou1Items[position])){
                    Getuyou1.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Getuyou1Items[position])){
                    Getuyou1.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Getuyou1Items[position])){
                    Getuyou1.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Getuyou1Items[position])){
                    Getuyou1.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Getuyou1Items[position])){
                    Getuyou1.setBackgroundResource(R.drawable.other)
                }else{
                    Getuyou1.setBackgroundResource(border)
                }



                //firestoreに自動保存
                val Getuyou1_sub = hashMapOf(
                    "Getuyou1" to Getuyou1_text ,
                )

                db.collection("users_data").document("$user_name").collection("Getuyou1")
                    .document("*")
                    .set(Getuyou1_sub , SetOptions.merge())
                sharedPref1.edit().putString("Getuyou1" , Getuyou1_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }








        Getuyou2Items.add(0 , savedText2.toString())
        val adapter2 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner , Getuyou2Items
        )
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        Getuyou2.adapter = adapter2

        // OnItemSelectedListenerの実装
        Getuyou2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Getuyou2_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Getuyou2Items[position])) {
                    Getuyou2.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Getuyou2Items[position])){
                    Getuyou2.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Getuyou2Items[position])){
                    Getuyou2.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Getuyou2Items[position])){
                    Getuyou2.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Getuyou2Items[position])){
                    Getuyou2.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Getuyou2Items[position])){
                    Getuyou2.setBackgroundResource(R.drawable.other)
                }else{
                    Getuyou2.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Getuyou2_sub = hashMapOf(
                    "Getuyou2" to Getuyou2_text ,
                )
                db.collection("users_data").document("$user_name").collection("Getuyou2")
                    .document("*")
                    .set(Getuyou2_sub , SetOptions.merge())
                sharedPref2.edit().putString("Getuyou2" , Getuyou2_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }






        Getuyou3Items.add(0 , savedText3.toString())
        val adapter3 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner , Getuyou3Items
        )
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        Getuyou3.adapter = adapter3

        // OnItemSelectedListenerの実装
        Getuyou3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Getuyou3_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Getuyou3Items[position])) {
                    Getuyou3.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Getuyou3Items[position])){
                    Getuyou3.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Getuyou3Items[position])){
                    Getuyou3.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Getuyou3Items[position])){
                    Getuyou3.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Getuyou3Items[position])){
                    Getuyou3.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Getuyou3Items[position])){
                    Getuyou3.setBackgroundResource(R.drawable.other)
                }else{
                    Getuyou3.setBackgroundResource(border)
                }
                //firestoreに自動保存
                val Getuyou3_sub = hashMapOf(
                    "Getuyou3" to Getuyou3_text ,
                )
                db.collection("users_data").document("$user_name").collection("Getuyou3")
                    .document("*")
                    .set(Getuyou3_sub , SetOptions.merge())
                sharedPref3.edit().putString("Getuyou3" , Getuyou3_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }







        Getuyou4Items.add(0 , savedText4.toString())
        val adapter4 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner , Getuyou4Items
        )
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        Getuyou4.adapter = adapter4

        // OnItemSelectedListenerの実装
        Getuyou4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Getuyou4_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Getuyou4Items[position])) {
                    Getuyou4.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Getuyou4Items[position])){
                    Getuyou4.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Getuyou4Items[position])){
                    Getuyou4.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Getuyou4Items[position])){
                    Getuyou4.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Getuyou4Items[position])){
                    Getuyou4.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Getuyou4Items[position])){
                    Getuyou4.setBackgroundResource(R.drawable.other)
                }else{
                    Getuyou4.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Getuyou4_sub = hashMapOf(
                    "Getuyou4" to Getuyou4_text ,
                )
                db.collection("users_data").document("$user_name").collection("Getuyou4")
                    .document("*")
                    .set(Getuyou4_sub , SetOptions.merge())
                sharedPref4.edit().putString("Getuyou4" , Getuyou4_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        //以前に選択されたものをリストの一番最初に追加
        Getuyou5Items.add(0 , savedText5.toString())
        val adapter5 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner , Getuyou5Items
        )
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        Getuyou5.adapter = adapter5

        // OnItemSelectedListenerの実装
        Getuyou5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Getuyou5_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Getuyou5Items[position])) {
                    Getuyou5.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Getuyou5Items[position])){
                    Getuyou5.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Getuyou5Items[position])){
                    Getuyou5.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Getuyou5Items[position])){
                    Getuyou5.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Getuyou5Items[position])){
                    Getuyou5.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Getuyou5Items[position])){
                    Getuyou5.setBackgroundResource(R.drawable.other)
                }else{
                    Getuyou5.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Getuyou5_sub = hashMapOf(
                    "Getuyou5" to Getuyou5_text ,
                )
                db.collection("users_data").document("$user_name").collection("Getuyou5")
                    .document("*")
                    .set(Getuyou5_sub , SetOptions.merge())
                sharedPref5.edit().putString("Getuyou5" , Getuyou5_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        //以前に選択されたものをリストの一番最初に追加
        Getuyou6Items.add(0 , savedText6.toString())
        val adapter6 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner , Getuyou6Items
        )
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        Getuyou6.adapter = adapter6

        // OnItemSelectedListenerの実装
        Getuyou6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Getuyou6_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Getuyou6Items[position])) {
                    Getuyou6.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Getuyou6Items[position])){
                    Getuyou6.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Getuyou6Items[position])){
                    Getuyou6.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Getuyou6Items[position])){
                    Getuyou6.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Getuyou6Items[position])){
                    Getuyou6.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Getuyou6Items[position])){
                    Getuyou6.setBackgroundResource(R.drawable.other)
                }else{
                    Getuyou6.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Getuyou6_sub = hashMapOf(
                    "Getuyou6" to Getuyou6_text ,
                )
                db.collection("users_data").document("$user_name").collection("Getuyou6")
                    .document("*")
                    .set(Getuyou6_sub , SetOptions.merge())
                sharedPref6.edit().putString("Getuyou6" , Getuyou6_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        //以前に選択されたものをリストの一番最初に追加
        Kayou1Items.add(0 , savedText8.toString())

        val adapter8 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kayou1Items
        )
        adapter8.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kayou1.adapter = adapter8

        // OnItemSelectedListenerの実装
        Kayou1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kayou1_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kayou1Items[position])) {
                    Kayou1.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kayou1Items[position])){
                    Kayou1.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kayou1Items[position])){
                    Kayou1.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kayou1Items[position])){
                    Kayou1.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kayou1Items[position])){
                    Kayou1.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kayou1Items[position])){
                    Kayou1.setBackgroundResource(R.drawable.other)
                }else{
                    Kayou1.setBackgroundResource(border)
                }
                //firestoreに自動保存
                val Kayou1_sub = hashMapOf(
                    "Kayou1" to Kayou1_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kayou1")
                    .document("*")
                    .set(Kayou1_sub , SetOptions.merge())
                sharedPref8.edit().putString("Kayou1" , Kayou1_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        //以前に選択されたものをリストの一番最初に追加
        Kayou2Items.add(0 , savedText9.toString())

        val adapter9 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kayou2Items
        )
        adapter9.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kayou2.adapter = adapter9

        // OnItemSelectedListenerの実装
        Kayou2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kayou2_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kayou2Items[position])) {
                    Kayou2.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kayou2Items[position])){
                    Kayou2.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kayou2Items[position])){
                    Kayou2.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kayou2Items[position])){
                    Kayou2.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kayou2Items[position])){
                    Kayou2.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kayou2Items[position])){
                    Kayou2.setBackgroundResource(R.drawable.other)
                }else{
                    Kayou2.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Kayou2_sub = hashMapOf(
                    "Kayou2" to Kayou2_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kayou2")
                    .document("*")
                    .set(Kayou2_sub , SetOptions.merge())
                sharedPref9.edit().putString("Kayou2" , Kayou2_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        //以前に選択されたものをリストの一番最初に追加
        Kayou3Items.add(0 , savedText10.toString())

        val adapter10 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kayou3Items
        )
        adapter10.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kayou3.adapter = adapter10

        // OnItemSelectedListenerの実装
        Kayou3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kayou3_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kayou3Items[position])) {
                    Kayou3.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kayou3Items[position])){
                    Kayou3.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kayou3Items[position])){
                    Kayou3.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kayou3Items[position])){
                    Kayou3.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kayou3Items[position])){
                    Kayou3.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kayou3Items[position])){
                    Kayou3.setBackgroundResource(R.drawable.other)
                }else{
                    Kayou3.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Kayou3_sub = hashMapOf(
                    "Kayou3" to Kayou3_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kayou3")
                    .document("*")
                    .set(Kayou3_sub , SetOptions.merge())
                sharedPref10.edit().putString("Kayou3" , Kayou3_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        //以前に選択されたものをリストの一番最初に追加
        Kayou4Items.add(0 , savedText11.toString())

        val adapter11 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kayou4Items
        )
        adapter11.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kayou4.adapter = adapter11

        // OnItemSelectedListenerの実装
        Kayou4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kayou4_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kayou4Items[position])) {
                    Kayou4.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kayou4Items[position])){
                    Kayou4.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kayou4Items[position])){
                    Kayou4.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kayou4Items[position])){
                    Kayou4.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kayou4Items[position])){
                    Kayou4.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kayou4Items[position])){
                    Kayou4.setBackgroundResource(R.drawable.other)
                }else{
                    Kayou4.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Kayou4_sub = hashMapOf(
                    "Kayou4" to Kayou4_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kayou4")
                    .document("*")
                    .set(Kayou4_sub , SetOptions.merge())
                sharedPref11.edit().putString("Kayou4" , Kayou4_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        Kayou5Items.add(0 , savedText12.toString())

        val adapter12 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kayou5Items
        )
        adapter12.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kayou5.adapter = adapter12

        // OnItemSelectedListenerの実装
        Kayou5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kayou5_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kayou5Items[position])) {
                    Kayou5.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kayou5Items[position])){
                    Kayou5.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kayou5Items[position])){
                    Kayou5.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kayou5Items[position])){
                    Kayou5.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kayou5Items[position])){
                    Kayou5.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kayou5Items[position])){
                    Kayou5.setBackgroundResource(R.drawable.other)
                }else{
                    Kayou5.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Kayou5_sub = hashMapOf(
                    "Kayou5" to Kayou5_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kayou5")
                    .document("*")
                    .set(Kayou5_sub , SetOptions.merge())
                sharedPref12.edit().putString("Kayou5" , Kayou5_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
        Kayou6Items.add(0 , savedText13.toString())

        val adapter13 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kayou6Items
        )
        adapter13.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kayou6.adapter = adapter13

        // OnItemSelectedListenerの実装
        Kayou6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kayou6_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kayou6Items[position])) {
                    Kayou6.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kayou6Items[position])){
                    Kayou6.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kayou6Items[position])){
                    Kayou6.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kayou6Items[position])){
                    Kayou6.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kayou6Items[position])){
                    Kayou6.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kayou6Items[position])){
                    Kayou6.setBackgroundResource(R.drawable.other)
                }else{
                    Kayou6.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Kayou6_sub = hashMapOf(
                    "Kayou6" to Kayou6_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kayou6")
                    .document("*")
                    .set(Kayou6_sub , SetOptions.merge())
                sharedPref13.edit().putString("Kayou6" , Kayou6_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }




        Suiyou1Items.add(0 , savedText15.toString())

        val adapter15 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Suiyou1Items
        )
        adapter15.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Suiyou1.adapter = adapter15

        // OnItemSelectedListenerの実装
        Suiyou1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Suiyou1_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Suiyou1Items[position])) {
                    Suiyou1.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Suiyou1Items[position])){
                    Suiyou1.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Suiyou1Items[position])){
                    Suiyou1.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Suiyou1Items[position])){
                    Suiyou1.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Suiyou1Items[position])){
                    Suiyou1.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Suiyou1Items[position])){
                    Suiyou1.setBackgroundResource(R.drawable.other)
                }else{
                    Suiyou1.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Suiyou1_sub = hashMapOf(
                    "Suiyou1" to Suiyou1_text ,
                )
                db.collection("users_data").document("$user_name").collection("Suiyou1")
                    .document("*")
                    .set(Suiyou1_sub , SetOptions.merge())
                sharedPref15.edit().putString("Suiyou1" , Suiyou1_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }



        Suiyou2Items.add(0 , savedText16.toString())

        val adapter16 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Suiyou2Items
        )
        adapter16.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Suiyou2.adapter = adapter16

        // OnItemSelectedListenerの実装
        Suiyou2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Suiyou2_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Suiyou2Items[position])) {
                    Suiyou2.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Suiyou2Items[position])){
                    Suiyou2.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Suiyou2Items[position])){
                    Suiyou2.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Suiyou2Items[position])){
                    Suiyou2.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Suiyou2Items[position])){
                    Suiyou2.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Suiyou2Items[position])){
                    Suiyou2.setBackgroundResource(R.drawable.other)
                }else{
                    Suiyou2.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Suiyou2_sub = hashMapOf(
                    "Suiyou2" to Suiyou2_text ,
                )
                db.collection("users_data").document("$user_name").collection("Suiyou2")
                    .document("*")
                    .set(Suiyou2_sub , SetOptions.merge())
                sharedPref16.edit().putString("Suiyou2" , Suiyou2_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        Suiyou3Items.add(0 , savedText17.toString())

        val adapter17 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Suiyou3Items
        )
        adapter17.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Suiyou3.adapter = adapter17

        // OnItemSelectedListenerの実装
        Suiyou3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Suiyou3_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Suiyou3Items[position])) {
                    Suiyou3.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Suiyou3Items[position])){
                    Suiyou3.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Suiyou3Items[position])){
                    Suiyou3.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Suiyou3Items[position])){
                    Suiyou3.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Suiyou3Items[position])){
                    Suiyou3.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Suiyou3Items[position])){
                    Suiyou3.setBackgroundResource(R.drawable.other)
                }else {
                    Suiyou3.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Suiyou3_sub = hashMapOf(
                    "Suiyou3" to Suiyou3_text ,
                )
                db.collection("users_data").document("$user_name").collection("Suiyou3")
                    .document("*")
                    .set(Suiyou3_sub , SetOptions.merge())
                sharedPref17.edit().putString("Suiyou3" , Suiyou3_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        Suiyou4Items.add(0 , savedText18.toString())

        val adapter18 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Suiyou4Items
        )
        adapter18.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Suiyou4.adapter = adapter18

        // OnItemSelectedListenerの実装
        Suiyou4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Suiyou4_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Suiyou4Items[position])) {
                    Suiyou4.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Suiyou4Items[position])){
                    Suiyou4.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Suiyou4Items[position])){
                    Suiyou4.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Suiyou4Items[position])){
                    Suiyou4.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Suiyou4Items[position])){
                    Suiyou4.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Suiyou4Items[position])){
                    Suiyou4.setBackgroundResource(R.drawable.other)
                }else{
                    Suiyou4.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Suiyou4_sub = hashMapOf(
                    "Suiyou4" to Suiyou4_text ,
                )
                db.collection("users_data").document("$user_name").collection("Suiyou4")
                    .document("*")
                    .set(Suiyou4_sub , SetOptions.merge())
                sharedPref18.edit().putString("Suiyou4" , Suiyou4_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }




        Suiyou5Items.add(0 , savedText19.toString())

        val adapter19 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Suiyou5Items
        )
        adapter19.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Suiyou5.adapter = adapter19

        // OnItemSelectedListenerの実装
        Suiyou5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Suiyou5_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Suiyou5Items[position])) {
                    Suiyou5.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Suiyou5Items[position])){
                    Suiyou5.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Suiyou5Items[position])){
                    Suiyou5.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Suiyou5Items[position])){
                    Suiyou5.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Suiyou5Items[position])){
                    Suiyou5.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Suiyou5Items[position])){
                    Suiyou5.setBackgroundResource(R.drawable.other)
                }else{
                    Suiyou5.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Suiyou5_sub = hashMapOf(
                    "Suiyou5" to Suiyou5_text ,
                )
                db.collection("users_data").document("$user_name").collection("Suiyou5")
                    .document("*")
                    .set(Suiyou5_sub , SetOptions.merge())
                sharedPref19.edit().putString("Suiyou5" , Suiyou5_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        Suiyou6Items.add(0 , savedText20.toString())

        val adapter20 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Suiyou6Items
        )
        adapter20.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Suiyou6.adapter = adapter20

        // OnItemSelectedListenerの実装
        Suiyou6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Suiyou6_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Suiyou6Items[position])) {
                    Suiyou6.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Suiyou6Items[position])){
                    Suiyou6.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Suiyou6Items[position])){
                    Suiyou6.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Suiyou6Items[position])){
                    Suiyou6.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Suiyou6Items[position])){
                    Suiyou6.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Suiyou6Items[position])){
                    Suiyou6.setBackgroundResource(R.drawable.other)
                }else{
                    Suiyou6.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Suiyou6_sub = hashMapOf(
                    "Suiyou6" to Suiyou6_text ,
                )
                db.collection("users_data").document("$user_name").collection("Suiyou6")
                    .document("*")
                    .set(Suiyou6_sub , SetOptions.merge())
                sharedPref20.edit().putString("Suiyou6" , Suiyou6_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }





        Mokuyou1Items.add(0 , savedText22.toString())

        val adapter22 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Mokuyou1Items
        )
        adapter22.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Mokuyou1.adapter = adapter22

        // OnItemSelectedListenerの実装
        Mokuyou1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Mokuyou1_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Mokuyou1Items[position])) {
                    Mokuyou1.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Mokuyou1Items[position])){
                    Mokuyou1.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Mokuyou1Items[position])){
                    Mokuyou1.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Mokuyou1Items[position])){
                    Mokuyou1.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Mokuyou1Items[position])){
                    Mokuyou1.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Mokuyou1Items[position])){
                    Mokuyou1.setBackgroundResource(R.drawable.other)
                }else{
                    Mokuyou1.setBackgroundResource(border)
                }

                //firestoreに自動保存
                val Mokuyou1_sub = hashMapOf(
                    "Mokuyou1" to Mokuyou1_text ,
                )
                db.collection("users_data").document("$user_name").collection("Mokuyou1")
                    .document("*")
                    .set(Mokuyou1_sub , SetOptions.merge())
                sharedPref22.edit().putString("Mokuyou1" , Mokuyou1_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        Mokuyou2Items.add(0 , savedText23.toString())

        val adapter23 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Mokuyou2Items
        )
        adapter23.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Mokuyou2.adapter = adapter23

        // OnItemSelectedListenerの実装
        Mokuyou2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Mokuyou2_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Mokuyou2Items[position])) {
                    Mokuyou2.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Mokuyou2Items[position])){
                    Mokuyou2.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Mokuyou2Items[position])){
                    Mokuyou2.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Mokuyou2Items[position])){
                    Mokuyou2.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Mokuyou2Items[position])){
                    Mokuyou2.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Mokuyou2Items[position])){
                    Mokuyou2.setBackgroundResource(R.drawable.other)
                }else{
                    Mokuyou2.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Mokuyou2_sub = hashMapOf(
                    "Mokuyou2" to Mokuyou2_text ,
                )
                db.collection("users_data").document("$user_name").collection("Mokuyou2")
                    .document("*")
                    .set(Mokuyou2_sub , SetOptions.merge())
                sharedPref23.edit().putString("Mokuyou2" , Mokuyou2_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }



        Mokuyou3Items.add(0 , savedText24.toString())

        val adapter24 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Mokuyou3Items
        )
        adapter24.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Mokuyou3.adapter = adapter24

        // OnItemSelectedListenerの実装
        Mokuyou3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Mokuyou3_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Mokuyou3Items[position])) {
                    Mokuyou3.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Mokuyou3Items[position])){
                    Mokuyou3.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Mokuyou3Items[position])){
                    Mokuyou3.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Mokuyou3Items[position])){
                    Mokuyou3.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Mokuyou3Items[position])){
                    Mokuyou3.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Mokuyou3Items[position])){
                    Mokuyou3.setBackgroundResource(R.drawable.other)
                }else{
                    Mokuyou3.setBackgroundResource(border)
                }



                //firestoreに自動保存
                val Mokuyou3_sub = hashMapOf(
                    "Mokuyou3" to Mokuyou3_text ,
                )
                db.collection("users_data").document("$user_name").collection("Mokuyou3")
                    .document("*")
                    .set(Mokuyou3_sub , SetOptions.merge())
                sharedPref24.edit().putString("Mokuyou3" , Mokuyou3_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }




        Mokuyou4Items.add(0 , savedText25.toString())

        val adapter25 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Mokuyou4Items
        )
        adapter25.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Mokuyou4.adapter = adapter25

        // OnItemSelectedListenerの実装
        Mokuyou4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Mokuyou4_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Mokuyou4Items[position])) {
                    Mokuyou4.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Mokuyou4Items[position])){
                    Mokuyou4.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Mokuyou4Items[position])){
                    Mokuyou4.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Mokuyou4Items[position])){
                    Mokuyou4.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Mokuyou4Items[position])){
                    Mokuyou4.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Mokuyou4Items[position])){
                    Mokuyou4.setBackgroundResource(R.drawable.other)
                }else{
                    Mokuyou4.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Mokuyou4_sub = hashMapOf(
                    "Mokuyou4" to Mokuyou4_text ,
                )
                db.collection("users_data").document("$user_name").collection("Mokuyou4")
                    .document("*")
                    .set(Mokuyou4_sub , SetOptions.merge())
                sharedPref25.edit().putString("Mokuyou4" , Mokuyou4_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        Mokuyou5Items.add(0 , savedText26.toString())

        val adapter26 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Mokuyou5Items
        )
        adapter26.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Mokuyou5.adapter = adapter26

        // OnItemSelectedListenerの実装
        Mokuyou5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Mokuyou5_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Mokuyou5Items[position])) {
                    Mokuyou5.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Mokuyou5Items[position])){
                    Mokuyou5.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Mokuyou5Items[position])){
                    Mokuyou5.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Mokuyou5Items[position])){
                    Mokuyou5.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Mokuyou5Items[position])){
                    Mokuyou5.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Mokuyou5Items[position])){
                    Mokuyou5.setBackgroundResource(R.drawable.other)
                }else{
                    Mokuyou5.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Mokuyou5_sub = hashMapOf(
                    "Mokuyou5" to Mokuyou5_text ,
                )
                db.collection("users_data").document("$user_name").collection("Mokuyou5")
                    .document("*")
                    .set(Mokuyou5_sub , SetOptions.merge())
                sharedPref26.edit().putString("Mokuyou5" , Mokuyou5_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        Mokuyou6Items.add(0 , savedText27.toString())

        val adapter27 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Mokuyou6Items
        )
        adapter27.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Mokuyou6.adapter = adapter27

        // OnItemSelectedListenerの実装
        Mokuyou6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Mokuyou6_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Mokuyou6Items[position])) {
                    Mokuyou6.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Mokuyou6Items[position])){
                    Mokuyou6.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Mokuyou6Items[position])){
                    Mokuyou6.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Mokuyou6Items[position])){
                    Mokuyou6.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Mokuyou6Items[position])){
                    Mokuyou6.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Mokuyou6Items[position])){
                    Mokuyou6.setBackgroundResource(R.drawable.other)
                }else{
                    Mokuyou6.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Mokuyou6_sub = hashMapOf(
                    "Mokuyou6" to Mokuyou6_text ,
                )
                db.collection("users_data").document("$user_name").collection("Mokuyou6")
                    .document("*")
                    .set(Mokuyou6_sub , SetOptions.merge())
                sharedPref27.edit().putString("Mokuyou6" , Mokuyou6_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }





        Kinyou1Items.add(0 , savedText29.toString())

        val adapter29 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kinyou1Items
        )
        adapter29.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kinyou1.adapter = adapter29

        // OnItemSelectedListenerの実装
        Kinyou1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kinyou1_text = parent?.selectedItem as String

                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kinyou1Items[position])) {
                    Kinyou1.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kinyou1Items[position])){
                    Kinyou1.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kinyou1Items[position])){
                    Kinyou1.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kinyou1Items[position])){
                    Kinyou1.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kinyou1Items[position])){
                    Kinyou1.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kinyou1Items[position])){
                    Kinyou1.setBackgroundResource(R.drawable.other)
                }else{
                    Kinyou1.setBackgroundResource(border)
                }



                //firestoreに自動保存
                val Kinyou1_sub = hashMapOf(
                    "Kinyou1" to Kinyou1_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kinyou1")
                    .document("*")
                    .set(Kinyou1_sub , SetOptions.merge())
                sharedPref29.edit().putString("Kinyou1" , Kinyou1_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        Kinyou2Items.add(0 , savedText30.toString())

        val adapter30 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kinyou2Items
        )
        adapter30.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kinyou2.adapter = adapter30

        // OnItemSelectedListenerの実装
        Kinyou2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kinyou2_text = parent?.selectedItem as String



                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kinyou2Items[position])) {
                    Kinyou2.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kinyou2Items[position])){
                    Kinyou2.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kinyou2Items[position])){
                    Kinyou2.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kinyou2Items[position])){
                    Kinyou2.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kinyou2Items[position])){
                    Kinyou2.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kinyou2Items[position])){
                    Kinyou2.setBackgroundResource(R.drawable.other)
                }else{
                    Kinyou2.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Kinyou2_sub = hashMapOf(
                    "Kinyou2" to Kinyou2_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kinyou2")
                    .document("*")
                    .set(Kinyou2_sub , SetOptions.merge())
                sharedPref30.edit().putString("Kinyou2" , Kinyou2_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        Kinyou3Items.add(0 , savedText31.toString())

        val adapter31 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kinyou3Items
        )
        adapter31.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kinyou3.adapter = adapter31

        // OnItemSelectedListenerの実装
        Kinyou3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kinyou3_text = parent?.selectedItem as String


                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kinyou3Items[position])) {
                    Kinyou3.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kinyou3Items[position])){
                    Kinyou3.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kinyou3Items[position])){
                    Kinyou3.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kinyou3Items[position])){
                    Kinyou3.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kinyou3Items[position])){
                    Kinyou3.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kinyou3Items[position])){
                    Kinyou3.setBackgroundResource(R.drawable.other)
                }else{
                    Kinyou3.setBackgroundResource(border)
                }



                //firestoreに自動保存
                val Kinyou3_sub = hashMapOf(
                    "Kinyou3" to Kinyou3_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kinyou3")
                    .document("*")
                    .set(Kinyou3_sub , SetOptions.merge())
                sharedPref31.edit().putString("Kinyou3" , Kinyou3_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        Kinyou4Items.add(0 , savedText32.toString())

        val adapter32 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kinyou4Items
        )
        adapter32.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kinyou4.adapter = adapter32

        // OnItemSelectedListenerの実装
        Kinyou4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kinyou4_text = parent?.selectedItem as String



                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kinyou4Items[position])) {
                    Kinyou4.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kinyou4Items[position])){
                    Kinyou4.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kinyou4Items[position])){
                    Kinyou4.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kinyou4Items[position])){
                    Kinyou4.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kinyou4Items[position])){
                    Kinyou4.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kinyou4Items[position])){
                    Kinyou4.setBackgroundResource(R.drawable.other)
                }else{
                    Kinyou4.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Kinyou4_sub = hashMapOf(
                    "Kinyou4" to Kinyou4_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kinyou4")
                    .document("*")
                    .set(Kinyou4_sub , SetOptions.merge())
                sharedPref32.edit().putString("Kinyou4" , Kinyou4_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


        Kinyou5Items.add(0 , savedText33.toString())

        val adapter33 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kinyou5Items
        )
        adapter33.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kinyou5.adapter = adapter33

        // OnItemSelectedListenerの実装
        Kinyou5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kinyou5_text = parent?.selectedItem as String



                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kinyou5Items[position])) {
                    Kinyou5.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kinyou5Items[position])){
                    Kinyou5.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kinyou5Items[position])){
                    Kinyou5.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kinyou5Items[position])){
                    Kinyou5.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kinyou5Items[position])){
                    Kinyou5.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kinyou5Items[position])){
                    Kinyou5.setBackgroundResource(R.drawable.other)
                }else{
                    Kinyou5.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Kinyou5_sub = hashMapOf(
                    "Kinyou5" to Kinyou5_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kinyou5")
                    .document("*")
                    .set(Kinyou5_sub , SetOptions.merge())
                sharedPref33.edit().putString("Kinyou5" , Kinyou5_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }



        Kinyou6Items.add(0 , savedText34.toString())

        val adapter34 = ArrayAdapter(
            requireContext() ,
            R.layout.custom_spinner ,
            Kinyou6Items
        )
        adapter34.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Kinyou6.adapter = adapter34

        // OnItemSelectedListenerの実装
        Kinyou6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 項目が選択された時に呼ばれる
            override fun onItemSelected(
                parent: AdapterView<*>? ,
                view: View? ,
                position: Int ,
                id: Long
            ) {
                val Kinyou6_text = parent?.selectedItem as String



                //背景色の設定
                //positionは、選ばれたリストのindex
                if (japanese.contains(Kinyou6Items[position])) {
                    Kinyou6.setBackgroundResource(R.drawable.japanese)
                } else if(math.contains(Kinyou6Items[position])){
                    Kinyou6.setBackgroundResource(R.drawable.math)
                }else if(english.contains(Kinyou6Items[position])){
                    Kinyou6.setBackgroundResource(R.drawable.english)
                }else if(science.contains(Kinyou6Items[position])){
                    Kinyou6.setBackgroundResource(R.drawable.science)
                } else if(social.contains(Kinyou6Items[position])){
                    Kinyou6.setBackgroundResource(R.drawable.socieal)
                }else if(other.contains(Kinyou6Items[position])){
                    Kinyou6.setBackgroundResource(R.drawable.other)
                }else{
                    Kinyou6.setBackgroundResource(border)
                }


                //firestoreに自動保存
                val Kinyou6_sub = hashMapOf(
                    "Kinyou6" to Kinyou6_text ,
                )
                db.collection("users_data").document("$user_name").collection("Kinyou6")
                    .document("*")
                    .set(Kinyou6_sub , SetOptions.merge())
                sharedPref34.edit().putString("Kinyou6" , Kinyou6_text).apply()

            }

            // 基本的には呼ばれないが、何らかの理由で選択されることなく項目が閉じられたら呼ばれる
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }


    }


}










