package com.example.davaleba4



import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class answerFragment: Fragment(R.layout.answer_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textView1).text = answerFragmentArgs.fromBundle(requireArguments()).integerText1.toString()
        view.findViewById<TextView>(R.id.textView2).text = answerFragmentArgs.fromBundle(requireArguments()).integerText2.toString()
        view.findViewById<TextView>(R.id.textView3).text = answerFragmentArgs.fromBundle(requireArguments()).integerText3.toString()



    }

}