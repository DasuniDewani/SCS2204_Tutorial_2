object Salary{

    def Normal (normalHours : Double) 
        : Double = normalHours * 250
    def Ot (otHours : Double)
        : Double = otHours * 85
    def Income (normalHours : Double , otHours : Double)
        : Double = Normal(normalHours)+ Ot(otHours)
    def Tax (normalHours : Double , otHours : Double)
        :Double = Income(normalHours,otHours) * 0.12
    def NetSalary (normal : Double , ot : Double)
        :Double = Income(normal,ot) - Tax(normal,ot)

    def main(args:Array[String])={
        print("Enter the total work hours : ")
        var normal = scala.io.StdIn.readFloat()
        print("Enter the total OT hours : ")
        var ot = scala.io.StdIn.readFloat()
        println("Your net sallary is Rs." + NetSalary(normal,ot))

    }

}

/* To read a number from console input, 
   we use the method scala.io.StdIn.readInt(), 
   scala.io.StdIn.readFloat(). */