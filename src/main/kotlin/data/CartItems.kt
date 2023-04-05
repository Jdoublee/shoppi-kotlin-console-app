package data

// 전역에서 사용되는 싱글턴 객체로 생성
object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts // 외부 공개 read-only(mutable 선언)

    fun addProduct(product: Product) {
        mutableProducts[product]?.let {
            mutableProducts[product] = it + 1
        } ?: kotlin.run {
            mutableProducts[product] = 1
        }
    }
}