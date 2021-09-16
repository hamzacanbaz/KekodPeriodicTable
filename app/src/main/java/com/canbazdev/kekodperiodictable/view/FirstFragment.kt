package com.canbazdev.kekodperiodictable.view

import android.app.AlertDialog
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.canbazdev.kekodperiodictable.R
import com.canbazdev.kekodperiodictable.adapter.ElementAdapter
import com.canbazdev.kekodperiodictable.databinding.FragmentFirstBinding
import com.canbazdev.kekodperiodictable.model.Element
import com.canbazdev.kekodperiodictable.util.ElementTypes
import kotlin.math.roundToInt
import kotlin.random.Random


class FirstFragment : Fragment(), ElementAdapter.OnItemClickedListener {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    private val channel_id = "channel_id_01"
    private val notification_id = 101

    var elementList: ArrayList<Element> = arrayListOf()

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Notification Title"
            val descriptionText = "Today's element is: Bor"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(channel_id, name, importance).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager =
                getSystemService(
                    requireContext(),
                    NotificationManager::class.java
                ) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun sendNotification() {
        val builder = NotificationCompat.Builder(requireContext(), channel_id)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("Periodic Table")
            .setContentText("Se-lam-lar Kekod, günün elementi için uygulamayı ziyaret etmeyi unutma!")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(requireContext())) {
            notify(notification_id, builder.build())
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        createNotificationChannel()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_first, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sendNotification()
        val element1 = Element(
            shortName = "H",
            classification = ElementTypes.OtherNonMetals.ordinal,
            name = "Hydrogen",
            number = 1
        )
        val element2 = Element(
            shortName = "Li",
            classification = ElementTypes.AlkaliMetals.ordinal,
            name = "Lithium",
            number = 3
        )
        val element3 = Element(
            shortName = "Na",
            classification = ElementTypes.AlkaliMetals.ordinal,
            name = "Sodium",
            number = 11
        )
        val element4 = Element(
            shortName = "K",
            classification = ElementTypes.AlkaliMetals.ordinal,
            name = "Potassium",
            number = 19
        )
        val element5 = Element(
            shortName = "Rb",
            classification = ElementTypes.AlkaliMetals.ordinal,
            name = "Rubidium",
            number = 37
        )
        val element6 = Element(
            shortName = "Cs",
            classification = ElementTypes.AlkaliMetals.ordinal,
            name = "Caesium",
            number = 55
        )
        val element7 = Element(
            shortName = "Fr",
            classification = ElementTypes.AlkaliMetals.ordinal,
            name = "Francium",
            number = 87
        )
        val element8 = Element(isVisible = false)
        val element9 = Element(isVisible = false)
        val element10 = Element(isVisible = false)
        val element11 = Element(
            shortName = "Be",
            classification = ElementTypes.AlkalineEarthMetals.ordinal,
            name = "Beryllium",
            number = 4
        )
        val element12 = Element(
            shortName = "Mg",
            classification = ElementTypes.AlkalineEarthMetals.ordinal,
            name = "Magnesium",
            number = 12
        )
        val element13 = Element(
            shortName = "Ca",
            classification = ElementTypes.AlkalineEarthMetals.ordinal,
            name = "Calcium",
            number = 20
        )
        val element14 = Element(
            shortName = "Sr",
            classification = ElementTypes.AlkalineEarthMetals.ordinal,
            name = "Strontium",
            number = 38
        )
        val element15 = Element(
            shortName = "Ba",
            classification = ElementTypes.AlkalineEarthMetals.ordinal,
            name = "Barium",
            number = 56
        )
        val element16 = Element(
            shortName = "Ra",
            classification = ElementTypes.AlkalineEarthMetals.ordinal,
            name = "Radium",
            number = 88
        )
        val element17 = Element(isVisible = false)
        val element18 = Element(isVisible = false)
        val element19 = Element(isVisible = false)
        val element20 = Element(isVisible = false)
        val element21 = Element(isVisible = false)
        val element22 = Element(shortName = "Sc", name = "Scandium", number = 21)
        val element23 = Element(shortName = "Y", name = "Yttrium", number = 39)
        val element24 = Element(
            shortName = "Lu",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Lanthanoids",
            number = 57
        )
        val element25 = Element(
            shortName = "Lr",
            classification = ElementTypes.Actinides.ordinal,
            name = "Actinoids",
            number = 89
        )
        val element26 = Element(
            shortName = "La",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Lanthanum",
            number = 57
        )
        val element27 = Element(
            shortName = "Ac",
            classification = ElementTypes.Actinides.ordinal,
            name = "Actinium",
            number = 89
        )
        val element28 = Element(isVisible = false)
        val element29 = Element(isVisible = false)
        val element30 = Element(isVisible = false)
        val element31 = Element(shortName = "Ti", name = "Titanium", number = 22)
        val element32 = Element(shortName = "Zr", name = "Zirconium", number = 40)
        val element33 = Element(shortName = "Hf", name = "Hafnium", number = 72)
        val element34 = Element(shortName = "Rf", name = "Rutherfordium", number = 104)
        val element35 = Element(
            shortName = "Ce",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Cerium",
            number = 58
        )
        val element36 = Element(
            shortName = "Th",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium",
            number = 90
        )
        val element37 = Element(isVisible = false)
        val element38 = Element(isVisible = false)
        val element39 = Element(isVisible = false)
        val element40 = Element(shortName = "V", name = "Thorium", number = 23)
        val element41 = Element(shortName = "Nb", name = "Thorium", number = 41)
        val element42 = Element(shortName = "Ta", name = "Thorium", number = 73)
        val element43 = Element(shortName = "Db", name = "Thorium", number = 105)
        val element44 = Element(
            shortName = "Pr",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium",
            number = 59
        )
        val element45 = Element(
            shortName = "Pa",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium",
            number = 91
        )
        val element46 = Element(isVisible = false)
        val element47 = Element(isVisible = false)
        val element48 = Element(isVisible = false)
        val element49 = Element(shortName = "Cr", name = "Thorium", number = 24)
        val element50 = Element(shortName = "Mo", name = "Thorium", number = 42)
        val element51 = Element(shortName = "W", name = "Thorium", number = 74)
        val element52 = Element(shortName = "Sg", name = "Thorium", number = 106)
        val element53 = Element(
            shortName = "Nd",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium",
            number = 60
        )
        val element54 = Element(
            shortName = "U",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium",
            number = 92
        )
        val element55 = Element(isVisible = false)
        val element56 = Element(isVisible = false)
        val element57 = Element(isVisible = false)
        val element58 = Element(shortName = "Mn", name = "Thorium", number = 25)
        val element59 = Element(shortName = "Tc", name = "Thorium", number = 43)
        val element60 = Element(shortName = "Re", name = "Thorium", number = 75)
        val element61 = Element(shortName = "Bh", name = "Thorium", number = 107)
        val element62 = Element(
            shortName = "Pm",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium",
            number = 61
        )
        val element63 = Element(
            shortName = "Np",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium",
            number = 93
        )
        val element64 = Element(isVisible = false)
        val element65 = Element(isVisible = false)
        val element66 = Element(isVisible = false)
        val element67 = Element(shortName = "Fe", name = "Thorium", number = 26)
        val element68 = Element(shortName = "Ru", name = "Thorium", number = 44)
        val element69 = Element(shortName = "Os", name = "Thorium", number = 76)
        val element70 = Element(shortName = "Hs", name = "Thorium", number = 108)
        val element71 = Element(
            shortName = "Sm",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium",
            number = 62
        )
        val element72 = Element(
            shortName = "Pu",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium",
            number = 94
        )
        val element73 = Element(isVisible = false)
        val element74 = Element(isVisible = false)
        val element75 = Element(isVisible = false)
        val element76 = Element(shortName = "Co", name = "Thorium", number = 27)
        val element77 = Element(shortName = "Rh", name = "Thorium", number = 45)
        val element78 = Element(shortName = "Ir", name = "Thorium", number = 77)
        val element79 = Element(shortName = "Mt", name = "Thorium", number = 109)
        val element80 = Element(
            shortName = "Eu",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium",
            number = 63
        )
        val element81 = Element(
            shortName = "Am",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium",
            number = 95
        )
        val element82 = Element(isVisible = false)
        val element83 = Element(isVisible = false)
        val element84 = Element(isVisible = false)
        val element85 = Element(shortName = "Ni", name = "Thorium")
        val element86 = Element(shortName = "Pd", name = "Thorium")
        val element87 = Element(shortName = "Pt", name = "Thorium")
        val element88 = Element(shortName = "Ds", name = "Thorium")
        val element89 = Element(
            shortName = "Gd",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium"
        )
        val element90 = Element(
            shortName = "Cm",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium"
        )
        val element91 = Element(isVisible = false)
        val element92 = Element(isVisible = false)
        val element93 = Element(isVisible = false)
        val element94 = Element(shortName = "Cu", name = "Thorium")
        val element95 = Element(shortName = "Ag", name = "Thorium")
        val element96 = Element(shortName = "Au", name = "Thorium")
        val element97 = Element(shortName = "Rg", name = "Thorium")
        val element98 = Element(
            shortName = "Tb",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium"
        )
        val element99 = Element(
            shortName = "Bk",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium"
        )
        val element100 = Element(isVisible = false)
        val element101 = Element(isVisible = false)
        val element102 = Element(isVisible = false)
        val element103 = Element(shortName = "Zn", name = "Thorium")
        val element104 = Element(shortName = "Cd", name = "Thorium")
        val element105 = Element(shortName = "Hg", name = "Thorium")
        val element106 = Element(shortName = "Cn", name = "Thorium")
        val element107 = Element(
            shortName = "Dy",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium"
        )
        val element108 = Element(
            shortName = "Cf",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium"
        )
        val element109 = Element(isVisible = false)
        val element110 = Element(
            shortName = "B",
            classification = ElementTypes.Metalloids.ordinal,
            name = "Thorium"
        )
        val element111 = Element(
            shortName = "Al",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element112 = Element(
            shortName = "Ga",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element113 = Element(
            shortName = "In",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element114 = Element(
            shortName = "Tl",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element115 = Element(
            shortName = "Nh",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element116 = Element(
            shortName = "Ho",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium"
        )
        val element117 = Element(
            shortName = "Es",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium"
        )
        val element118 = Element(isVisible = false)
        val element119 = Element(
            shortName = "C",
            classification = ElementTypes.OtherNonMetals.ordinal,
            name = "Thorium"
        )
        val element120 = Element(
            shortName = "Si",
            classification = ElementTypes.Metalloids.ordinal,
            name = "Thorium"
        )
        val element121 = Element(
            shortName = "Ge",
            classification = ElementTypes.Metalloids.ordinal,
            name = "Thorium"
        )
        val element122 = Element(
            shortName = "Sn",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element123 = Element(
            shortName = "Pb",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element124 = Element(
            shortName = "Fl",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element125 = Element(
            shortName = "Er",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium"
        )
        val element126 = Element(
            shortName = "Fm",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium"
        )
        val element127 = Element(isVisible = false)
        val element128 = Element(
            shortName = "N",
            classification = ElementTypes.OtherNonMetals.ordinal,
            name = "Thorium"
        )
        val element129 = Element(
            shortName = "P",
            classification = ElementTypes.OtherNonMetals.ordinal,
            name = "Thorium"
        )
        val element130 = Element(
            shortName = "As",
            classification = ElementTypes.Metalloids.ordinal,
            name = "Thorium"
        )
        val element131 = Element(
            shortName = "Sb",
            classification = ElementTypes.Metalloids.ordinal,
            name = "Thorium"
        )
        val element132 = Element(
            shortName = "Bi",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element133 = Element(
            shortName = "Mc",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element134 = Element(
            shortName = "Tm",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium"
        )
        val element135 = Element(
            shortName = "Md",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium"
        )
        val element136 = Element(isVisible = false)
        val element137 = Element(
            shortName = "O",
            classification = ElementTypes.OtherNonMetals.ordinal,
            name = "Thorium"
        )
        val element138 = Element(
            shortName = "S",
            classification = ElementTypes.OtherNonMetals.ordinal,
            name = "Thorium"
        )
        val element139 = Element(
            shortName = "Se",
            classification = ElementTypes.OtherNonMetals.ordinal,
            name = "Thorium"
        )
        val element140 = Element(
            shortName = "Te",
            classification = ElementTypes.Metalloids.ordinal,
            name = "Thorium"
        )
        val element141 = Element(
            shortName = "Po",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element142 = Element(
            shortName = "Lv",
            classification = ElementTypes.OtherMetals.ordinal,
            name = "Thorium"
        )
        val element143 = Element(
            shortName = "Yb",
            classification = ElementTypes.Lanthanides.ordinal,
            name = "Thorium"
        )
        val element144 = Element(
            shortName = "No",
            classification = ElementTypes.Actinides.ordinal,
            name = "Thorium"
        )
        val element145 = Element(isVisible = false)
        val element146 = Element(
            shortName = "F",
            classification = ElementTypes.Halogens.ordinal,
            name = "Thorium"
        )
        val element147 = Element(
            shortName = "Cl",
            classification = ElementTypes.Halogens.ordinal,
            name = "Thorium"
        )
        val element148 = Element(
            shortName = "Br",
            classification = ElementTypes.Halogens.ordinal,
            name = "Thorium"
        )
        val element149 = Element(
            shortName = "I",
            classification = ElementTypes.Halogens.ordinal,
            name = "Thorium"
        )
        val element150 = Element(
            shortName = "At",
            classification = ElementTypes.Halogens.ordinal,
            name = "Thorium"
        )
        val element151 = Element(
            shortName = "Ts",
            classification = ElementTypes.Halogens.ordinal,
            name = "Thorium"
        )
        val element152 = Element(isVisible = false)
        val element153 = Element(isVisible = false)
        val element154 = Element(
            shortName = "He",
            classification = ElementTypes.NobleGases.ordinal,
            name = "Thorium"
        )
        val element155 = Element(
            shortName = "Ne",
            classification = ElementTypes.NobleGases.ordinal,
            name = "Thorium"
        )
        val element156 = Element(
            shortName = "Ar",
            classification = ElementTypes.NobleGases.ordinal,
            name = "Thorium"
        )
        val element157 = Element(
            shortName = "Kr",
            classification = ElementTypes.NobleGases.ordinal,
            name = "Thorium"
        )
        val element158 = Element(
            shortName = "Xe",
            classification = ElementTypes.NobleGases.ordinal,
            name = "Thorium"
        )
        val element159 = Element(
            shortName = "Rn",
            classification = ElementTypes.NobleGases.ordinal,
            name = "Thorium"
        )
        val element160 = Element(
            shortName = "Og",
            classification = ElementTypes.NobleGases.ordinal,
            name = "Thorium"
        )
        val element161 = Element(isVisible = false)
        val element162 = Element(isVisible = false)


        elementList =
            arrayListOf(
                element1,
                element2,
                element3,
                element4,
                element5,
                element6,
                element7,
                element8,
                element9,
                element10,
                element11,
                element12,
                element13,
                element14,
                element15,
                element16,
                element17,
                element18,
                element19,
                element20,
                element21,
                element22,
                element23,
                element24,
                element25,
                element26,
                element27,
                element28,
                element29,
                element30,
                element31,
                element32,
                element33,
                element34,
                element35,
                element36,
                element37,
                element38,
                element39,
                element40,
                element41,
                element42,
                element43,
                element44,
                element45,
                element46,
                element47,
                element48,
                element49,
                element50,
                element51,
                element52,
                element53,
                element54,
                element55,
                element56,
                element57,
                element58,
                element59,
                element60,
                element61,
                element62,
                element63,
                element64,
                element65,
                element66,
                element67,
                element68,
                element69,
                element70,
                element71,
                element72,
                element73,
                element74,
                element75,
                element76,
                element77,
                element78,
                element79,
                element80,
                element81,
                element82,
                element83,
                element84,
                element85,
                element86,
                element87,
                element88,
                element89,
                element90,
                element91,
                element92,
                element93,
                element94,
                element95,
                element96,
                element97,
                element98,
                element99,
                element100,
                element101,
                element102,
                element103,
                element104,
                element105,
                element106,
                element107,
                element108,
                element109,
                element110,
                element111,
                element112,
                element113,
                element114,
                element115,
                element116,
                element117,
                element118,
                element119,
                element120,
                element121,
                element122,
                element123,
                element124,
                element125,
                element126,
                element127,
                element128,
                element129,
                element130,
                element131,
                element132,
                element133,
                element134,
                element135,
                element136,
                element137,
                element138,
                element139,
                element140,
                element141,
                element142,
                element143,
                element144,
                element145,
                element146,
                element147,
                element148,
                element149,
                element150,
                element151,
                element152,
                element153,
                element154,
                element155,
                element156,
                element157,
                element158,
                element159,
                element160,
                element161,
                element162

            )

        val elementAdapter = ElementAdapter(elementList, this)
//        binding.recyclerview.scheduleLayoutAnimation()

        binding.recyclerview.layoutManager =
            GridLayoutManager(context, 9, GridLayoutManager.HORIZONTAL, false)
        binding.adapter = elementAdapter
//        binding.recyclerview.layoutAnimation =
//            AnimationUtils.loadLayoutAnimation(requireContext(), R.anim.grid_anim)

    }

    override fun onItemClicked(position: Int, element: Element) {
        println(position)
        println(elementList[position])
        val myDialogView =
            LayoutInflater.from(context).inflate(R.layout.element_detail_dialog, null)
        val mBuilder = AlertDialog.Builder(context).setView(myDialogView)
        val alert = mBuilder.create()
        alert.show()

        myDialogView.animation = AnimationUtils.loadAnimation(context, R.anim.from_bottom)

        myDialogView.findViewById<TextView>(R.id.elementName).text = element.name
        myDialogView.findViewById<TextView>(R.id.elementNumber).text = element.number.toString()
        myDialogView.findViewById<TextView>(R.id.elementShortName).text = element.shortName
        val atomic = Random.nextDouble(1.0000, 250.9999)
        val rounded = (atomic * 1000).roundToInt() / 1000.0
        myDialogView.findViewById<TextView>(R.id.elementAtomicWeight).text =
            getString(R.string.atomic_weight, rounded.toString())
//        myDialogView.findViewById<Button>(R.id.btn).setOnClickListener {
//
//            onItemClicked(position+1,elementList[position+1])
//            alert.dismiss()
//        }

        alert.show()
    }



    companion object {
        @JvmStatic
        fun newInstance() =
            FirstFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}