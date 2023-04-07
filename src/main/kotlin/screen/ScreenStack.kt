package screen

// 전역에서 사용되는 싱글턴 객체로 생성. 화면 관리
object ScreenStack {
    private val screenStack = mutableListOf<Screen>()

    fun push(screen: Screen) {
        screenStack.add(screen)
    }

    fun pop() {
        screenStack.removeLastOrNull()
    }

    fun peek(): Screen? {
        return screenStack.lastOrNull()
    }

}

sealed class Screen
