import chisel3._
class And extends Module {
    val io = IO(new Bundle {
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))
        val out = Output(UInt(1.W))
    })
    io.out := io.a & io.b
}
object AndGateGenerator extends App {
    emitVerilog(new And, Array("--target-dir", "generated"))
}
