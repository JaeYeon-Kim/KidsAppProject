package com.kjy.kidsapp


import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import com.unity3d.player.UnityPlayerActivity

class TestActivity() : UnityPlayerActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        // 사용자가 백키 눌렀을 경우 뒤로가기
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            println("여기 타뉭?")
            Log.e("유니티", "여기 타냐구!!")
            onBackPressed()
        }
        return true
    }
}