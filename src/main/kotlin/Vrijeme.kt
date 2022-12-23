class Vrijeme(var sati:Int=0,var minute:Int=0,var sekunde:Int=0) {
    override fun toString(): String {
        return "$sati : $minute : $sekunde"
    }

    fun postaviVrijeme(h:Int,m:Int,s:Int)
    {
        sati=h
        minute=m
        sekunde=s
    }

    fun razlikaVremenahms(h1:Vrijeme,h2:Vrijeme):String
    {
        var hr:Int=0
        var mr:Int=0
        var sr:Int=0
        if(h1.sati<h2.sati)
        {
            hr=h2.sati-h1.sati
        }
        if (h1.minute<h2.minute)
        {
            mr=h2.minute-h1.minute
        }
        if (h1.sekunde<h2.sekunde)
        {
            sr=h2.sekunde-h1.sekunde
        }

        return "Izmedju dva vremena proteklo je: $hr sati , $mr minuta, $sr sekundi."
    }

    fun razlikaVremena(h1:Vrijeme,h2:Vrijeme):String
    {
        var hr:Int=0
        var mr:Int=0
        var sr:Int=0
        if(h1.sati<h2.sati)
        {
            hr=h2.sati-h1.sati
            sr=sr+hr*3600
        }
        if (h1.minute<h2.minute)
        {
            mr=h2.minute-h1.minute
            sr=sr+mr*60
        }
        if (h1.sekunde<h2.sekunde)
        {
            var sr2=h2.sekunde-h1.sekunde
            sr=sr+sr2
        }

        return "Izmedju dva vremena proteklo je:$sr sekundi."
    }


}