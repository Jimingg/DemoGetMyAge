package sg.edu.rp.c346.demogetmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnGetAge.setOnClickListener {
        val userDOB = etDOB.text.toString()
        if(userDOB.isNotEmpty()){
            val year = Calendar.getInstance().get(Calendar.YEAR)
            val age = year - userDOB.toInt()

//            if (age < 18){
//                output = "Underage"
//            }else if(age >= 18 && age < 66){
//                output = "Young people"
//            }else if(age >= 66 && age < 80){
//                output = "Middle-aged"
//            }else if(age >= 80 && age < 100){
//                output = "Elderly"
//            }else{
//                output = "Long-lived elderly"
//
//            }
            var output = ""
            when(age){
                in 0..17 -> output = "Underage"
                in 18..65 -> output = "Young people"
                in 66..79 -> output = "Middle-aged"
                in 80..99 -> output = "Elderly"
            else ->{
                output = "Long-lived elderly"
                }
            }
            tvShowAge.text= "Your age is $age \n $output"
        }else{
            Toast.makeText(this,"please enter your birth year",Toast.LENGTH_LONG).show()
        }

    }
    }
}
