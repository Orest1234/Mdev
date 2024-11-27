package com.lab3.data
import androidx.annotation.DrawableRes
import com.lab3.R
/**
 * ItemsData - singleton class (only one instance) can be the example of shared data source
 * You can get the data from this ItemsData object from any place in the code.
 */
object ItemsData {
    val itemsList = listOf(
        Item(1, "Резиденція митрополитів Буковини і Далмації", "Велична архітектурна пам'ятка в Чернівцях, внесена до списку Світової спадщини ЮНЕСКО.", R.drawable.image1),
        Item(2, "Хотинська фортеця", "Масштабна середньовічна фортеця на березі Дністра, відома своєю історією та битвами.", R.drawable.image2),
        Item(3, "Центральна площа Чернівців", "Головна площа міста з історичними будівлями, яка є популярним місцем прогулянок.", R.drawable.image3),
        Item(4, "Вірменська церква", "Архітектурний шедевр у Чернівцях, побудований у стилі неоготики.", R.drawable.image4),
        Item(5, "Костел Пресвятого Серця Ісуса", "Готичний храм у Чернівцях, відомий своєю вражаючою архітектурою.", R.drawable.image5),
    )
}



// Item class
class Item(val id: Int, val title: String, val description: String, @DrawableRes val imageRes: Int)
