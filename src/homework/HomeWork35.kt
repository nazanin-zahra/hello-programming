package homework

import java.util.*

object
HomeWork35 {
//برنامه ای بنویسید که قرار است مالیات حقوق یک کارمند را حساب کنید.
//اگر حقوق وی کمتر از ۲۰۰۰ تومن بود ؛مالیاتی ندارد .
//اگر بین ۲۰۰۰ تا ۵۰۰۰ تومن بود ؛۲۰ درصد و تا ۶۰۰۰ تومن بود ؛۴۰
// درصد و در صورت بالاتر بودن ۵۰ درصد ان باید مالیات باشد .
// میزان مالیات دریافتی ؛باقی مانده دریافتی و درصد مالیات ان را چاپ کند .
    @JvmStatic
    fun main(args: Array<String>) {
        val income = 4200
        when (income) {
            in 0..2000 -> calculateAndPrint(0, income)
            in 2000..4000 -> calculateAndPrint(20, income)
            in 4000..6000 -> calculateAndPrint(40, income)
            else -> calculateAndPrint(50, income)
        }
    }

    private fun calculateAndPrint(percentOfTax: Int, income: Int) {
        println("Percent of tax: $percentOfTax")
        val tax = income * percentOfTax / 100
        println("Tax: $tax")
        val remForIncome = income - tax
        println("Rem for tax: $remForIncome")
    }
}

