fun main(){
    name("Alice Moraa")
    data("Alice Moraa",25)
    city("Nakuru")
    message("I am smart","I am good")

}
//string case
fun name(names:String){
    var full = names
    //printing the uppercase
    println(names.uppercase())
    //printing the lower case
    println(names.lowercase())
    //capitalizing it
    println(names.capitalize())
    //decapitalizing it
    println(names.decapitalize())
}
//trying out string interpolation
fun data(names:String,age:Int){
    var sentence = "my name is $names and am $age years old"
   println(sentence)
}
//string indexing
fun city(cities:String){
    var citys = cities
    println(citys)
    println(citys[0])
    println(citys[2])
    println(citys[3])
}
fun message(x:String,y:String){
    var mess = x==y
    println(mess.equals(x==y))

}

