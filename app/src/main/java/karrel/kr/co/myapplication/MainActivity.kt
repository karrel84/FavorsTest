package karrel.kr.co.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFlavors()
    }

    private fun initFlavors() {
        if (BuildConfig.appType == "A") {
            text.text = "A 타입의 앱입니다."
        } else if (BuildConfig.appType == "B") {
            text.text = "B 타입의 앱입니다."
        }
    }
}
