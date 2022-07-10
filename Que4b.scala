object Profit{

    def Atteandance (ticketPrice : Int )
        :Int= 120 + (15 - ticketPrice)/5 * 20
    def Revenue (ticketPrice : Int)
        :Int = ticketPrice * Atteandance(ticketPrice)
    def Cost (ticketPrice : Int)
        :Int = 500 + 3 * Atteandance(ticketPrice)
    def Profit (ticketPrice : Int)
        :Int = Revenue(ticketPrice)-Cost(ticketPrice)

    def main(args:Array[String])={
        print("Enter the price of a ticket : ")
        var price = scala.io.StdIn.readInt()
        var attend = Atteandance(price)
        if(attend <= 0)
            println("Any customers will not come under Rs." + price + " tickets")
        else
            println("Your profit is Rs." + Profit(price)+" for Rs." + price+" tickets.")    
    }
}