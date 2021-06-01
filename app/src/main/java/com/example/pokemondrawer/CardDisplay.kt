package com.example.pokemondrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.graphics.Color
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_blank.view.*
import kotlinx.android.synthetic.main.fragment_blank2.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_blank2, container, false)
        var diamond = 100
        var common = 0
        var rare = 0
        var epic = 0
        var legendary = 0

        rootView.button2.setOnClickListener {
            var random = (0..99).random()
            if(random in 0..14){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p01))
                rootView.textView3.setText("Bulbasaur")
                rootView.textView3.setTextColor(Color.GRAY)
                rootView.textView4.setText("You got a Common Pokemon!")
                common+=1
                rootView.common.setText("common:".plus(common))
            }
            if(random in 15..20){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p02))
                rootView.textView3.setText("Ivysaur")
                rootView.textView3.setTextColor(Color.BLUE)
                rootView.textView4.setText("You got a Rare Pokemon!")
                rare+=1
                rootView.rare.setText("rare:".plus(rare))
            }
            if(random in 21..23){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p03))
                rootView.textView3.setText("Venusaur")
                rootView.textView3.setTextColor(Color.rgb(156,39,176))
                rootView.textView4.setText("You got an Epic Pokemon!")
                epic+=1
                rootView.epic.setText("epic:".plus(epic))
            }
            if(random == 24){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p04))
                rootView.textView3.setText("MegaVenusaur")
                rootView.textView3.setTextColor(Color.rgb(255,87,34))
                rootView.textView4.setText("You got a Legendary Pokemon!")
                legendary+=1
                rootView.legendary.setText("legendary:".plus(legendary))
            }
            if(random in 25..39){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p05))
                rootView.textView3.setText("Charmander")
                rootView.textView3.setTextColor(Color.GRAY)
                rootView.textView4.setText("You got a Common Pokemon!")
                common+=1
                rootView.common.setText("common:".plus(common))
            }
            if(random in 40..45){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p06))
                rootView.textView3.setText("Charmeleon")
                rootView.textView3.setTextColor(Color.BLUE)
                rootView.textView4.setText("You got a Rare Pokemon!")
                rare+=1
                rootView.rare.setText("rare:".plus(rare))
            }
            if(random in 46..48){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p07))
                rootView.textView3.setText("Charizard")
                rootView.textView3.setTextColor(Color.rgb(156,39,176))
                rootView.textView4.setText("You got an Epic Pokemon!")
                epic+=1
                rootView.epic.setText("epic:".plus(epic))
            }
            if(random == 49){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p08))
                rootView.textView3.setText("MegaCharizard")
                rootView.textView3.setTextColor(Color.rgb(255,87,34))
                rootView.textView4.setText("You got a Legendary Pokemon!")
                legendary+=1
                rootView.legendary.setText("legendary:".plus(legendary))
            }
            if(random in 50..64){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p09))
                rootView.textView3.setText("Squirtle")
                rootView.textView3.setTextColor(Color.GRAY)
                rootView.textView4.setText("You got a Common Pokemon!")
                common+=1
                rootView.common.setText("common:".plus(common))
            }
            if(random in 65..70){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p10))
                rootView.textView3.setText("Wartortle")
                rootView.textView3.setTextColor(Color.BLUE)
                rootView.textView4.setText("You got a Rare Pokemon!")
                rare+=1
                rootView.rare.setText("rare:".plus(rare))
            }
            if(random in 71..73){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p11))
                rootView.textView3.setText("Blastoise")
                rootView.textView3.setTextColor(Color.rgb(156,39,176))
                rootView.textView4.setText("You got an Epic Pokemon!")
                epic+=1
                rootView.epic.setText("epic:".plus(epic))
            }
            if(random == 74){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p12))
                rootView.textView3.setText("MegaBlastoise")
                rootView.textView3.setTextColor(Color.rgb(255,87,34))
                rootView.textView4.setText("You got a Legendary Pokemon!")
                legendary+=1
                rootView.legendary.setText("legendary:".plus(legendary))
            }
            if(random in 75..89){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p13))
                rootView.textView3.setText("Pichu")
                rootView.textView3.setTextColor(Color.GRAY)
                rootView.textView4.setText("You got a Common Pokemon!")
                common+=1
                rootView.common.setText("common:".plus(common))
            }
            if(random in 90..95){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p14))
                rootView.textView3.setText("Pikachu")
                rootView.textView3.setTextColor(Color.BLUE)
                rootView.textView4.setText("You got a Rare Pokemon!")
                rare+=1
                rootView.rare.setText("rare:".plus(rare))
            }
            if(random in 96..98){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p15))
                rootView.textView3.setText("Raichu")
                rootView.textView3.setTextColor(Color.rgb(156,39,176))
                rootView.textView4.setText("You got an Epic Pokemon!")
                epic+=1
                rootView.epic.setText("epic:".plus(epic))
            }
            if(random == 99){
                rootView.imageView.setImageDrawable(getResources().getDrawable(R.drawable.p16))
                rootView.imageView.setBackgroundColor(Color.YELLOW)
                rootView.textView3.setText("RaichuAlola")
                rootView.textView3.setTextColor(Color.rgb(255,87,34))
                rootView.textView4.setText("You got a Legendary Pokemon!")
                legendary+=1
                rootView.legendary.setText("legendary:".plus(legendary))
            }
            diamond -= 10
            if(diamond == 0){
                rootView.button2.isEnabled = false
            }
            rootView.textView9.setText(diamond.toString())
        }
        rootView.button3.setOnClickListener {
            rootView.button2.isEnabled = true
            diamond += 100
            rootView.textView9.setText(diamond.toString())
        }
        return rootView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}