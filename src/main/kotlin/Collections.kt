fun main(){
    var mShopList = mutableListOf("Чай", "Яйца", "Молоко")
    println("Мне нужно купить: $mShopList")
    val extShopList = mutableListOf("Печенье", "Творог")
    mShopList.addAll(extShopList)
    println("Вот новый список покупок: $mShopList")
    if (mShopList.contains("Чай")) {
        mShopList.set(mShopList.indexOf("Чай"), "Кофе")
    }
        mShopList.sort()
        println("Продукты по алфавиту $mShopList")
        mShopList.reverse()
        println("Продукты по алфавиту c конца $mShopList")
    val mShopSet = mShopList.toMutableSet()
    println("mShopSet: $mShopSet")
    val moreShop = setOf("Сыр", "Колбаса")
    mShopSet.addAll(moreShop)
    println("Список продуктов в Set: $mShopSet")
    mShopList = mShopSet.toMutableList()
    println("Измененный списк продуктов $mShopList")
    println(mShopList.size)
    }
