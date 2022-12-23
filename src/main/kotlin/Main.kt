fun main()
{
    val v1=Vrijeme()
    val v2=Vrijeme()
    val vr=Vrijeme()

    v1.postaviVrijeme(1,15,10)
    v2.postaviVrijeme(2,30,15)

    println(vr.razlikaVremenahms(v1,v2))
    println(vr.razlikaVremena(v1,v2))
}