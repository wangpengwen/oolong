package counter

import oolong.Dispose
import oolong.JavaFX
import tornadofx.App
import tornadofx.find
import tornadofx.launch

class CounterApp : App(CounterView::class, Styles::class) {

    private val dispose: Dispose

    init {
        find(CounterView::class).run {
            dispose = JavaFX.runtime(
                Counter.init,
                Counter.update,
                Counter.view,
                render
            )
        }
    }

    override fun stop() {
        dispose()
        super.stop()
    }

    companion object {

        @JvmStatic
        fun main(vararg args: String) {
            launch<CounterApp>(*args)
        }

    }

}