package com.example.davaleba4


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class questionFragment: Fragment(R.layout.question_fragment) {
    lateinit var editText1: EditText
    lateinit var editText2: EditText
    lateinit var editText3: EditText
    lateinit var sendButton: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText1 = view.findViewById(R.id.edittext1)
        editText2 = view.findViewById(R.id.edittext2)
        editText3 = view.findViewById(R.id.edittext3)
        sendButton = view.findViewById(R.id.sendbutton)
        val navController1 = Navigation.findNavController(view)



        sendButton.setOnClickListener {
            val integertext1 = editText1.text.toString()
            val integertext2 = editText2.text.toString()
            val integertext3 = editText3.text.toString()


            val integertext4 = integertext1.toInt()
            val integertext5 = integertext2.toInt()
            val integertext6 = integertext3.toInt()
            findNavController().navigate(questionFragmentDirections.actionQuestionFragmentToAnswerFragment2(integertext4, integertext5,integertext6))







        }




    }

}