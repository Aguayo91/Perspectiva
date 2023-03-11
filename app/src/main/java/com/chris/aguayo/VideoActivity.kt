package com.chris.aguayo

import android.content.pm.ActivityInfo
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.chris.aguayo.databinding.ActivityVideoBinding

class VideoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVideoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)

        val online:Uri = Uri.parse("https://lh3.googleusercontent.com/eePPkuy5V1qDa2QKELAmKKgE_se00cGvcik_UTHUfwnZDrZ32KtTq9m6B5JNYSfjmgnOm1sdY8-2noIUtEnMSWT8ttGrxI--UAljKDNyHyledt3b1D22pHWKMdsoZXFNhN93SR6XSPMZ8h2Wy0zh0KvvSKwnOh-aMabg7SbKjE-nOH-qQqJAWI__RmW_ggj-Vl3UnWGn91JeJtCB0LC6dlKVVyQgqNPSvGdBrIqARgAp8-IkSW6zje021BGh1xCiQMnGtMgQucdLf9JpOh1FwdbPs26u5GeqOr5Izhem3TpXJfD40k-OGXW12GEg6hCb9HpC0vzkvDqYgR6hLRTrNI2odG9WS8q0EWD1pjQd3CbmnthfxrksseE4XJ9wZP9OLahLg81UfXzZJqwdyOGBhtkfs690YTUISFnCMeKMODA3-DbzlwiRdzTnjvfho3THoxeLEQWIj6GZ4ndSaslXrcTs1vbhBtTBe_HSSa91uHFww-NCIVxuWI-zI3fNKIPnQvwEU6fa79-6CdoyU1x3ZRYz7Z7HQbJaDorEugMRPaqjH8rIK-0NweYTeX4v2xVwojpGoyOGMP4wyZBRqm7QIUydKLdGfY8gX3KjqfIo5wSmOFgkfwGVY21TPyae6vkyxdw5WVeZ_Xycv7AUO3J6eqnoxbkoIX0lNOqee_oXFAZOqb5_DbRke4H-4J6Xj2pq4ZIamiYjdPCek0vrp6F-pSzh78jD2ggU_gqm9wnevKAq0c1apbDSdxH-TVxk2375p0SbfRElQJlcBbxCbRlEdJJ7R9DVIGSStRlSwna6LBhwUEB4f19cl_KcITheE1LxDNHpay992n4_IeshMyYQsHxgUkbSAKrFDQMlP5ax9G0mkscGkaB-61hWB6qoTdxVBHhJy698EcA1aXH3MkS7O9QdiIsgWJJ-bAdIz7zs3ZnKBJApkIuO0MDnqn4FPPsG4uuzapHMM72csCgDzX2WpaoyzRaUkJl5Wcu2WpNJOn-zEE63_npIZyw4_koTlVhED_8PUqOOQeLwkl_VK4RxO3UMxeUmEuTWZ6bIhfKw6iKW2Y4LoO2vvyUNOyTV3-wB9RDRcbYhG2qeXpqEMafqPdnjbIF00A=w1080-h1342-no?authuser=0")
        binding.videoView.setMediaController(mediaController)
        binding.videoView.setVideoURI(online)
        binding.videoView.requestFocus()
        binding.videoView.start()
        }
}