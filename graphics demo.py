from graphics  import *




onestar=int(input("Enter the number of Movies with 0~1 rating-"))
twostar=int(input("Enter the number of Movies with 1~2 rating-"))
tristar=int(input("Enter the number of Movies with 2~3 rating-"))
frstar=int(input("Enter the number of Movies with 3~4 rating-"))
fivestar=int(input("Enter the number of Movies with 4~5 rating-"))



b1len=600-(onestar*15)
b2len=600-(twostar*15)
b3len=600-(tristar*15)
b4len=600-(frstar*15)
b5len=600-(fivestar*15)
try:
    #GraphWin function takes 3 parameters, the first one is the window name,2nd is the X-axis and the last one is the Y-axis
    desktop=GraphWin("Test window",800,700) 

    """
    #Point function takes two parameters, X-axis and Y axis
    dot=Point(800,200)
    dot.draw(desktop)"""


    """
    #Line funciton takes 2 parameters, both of them are Point Function itself as a parameter
    straight=Line(Point(100,200),Point(800,200))
    straight.draw(desktop)
    """

    """
    word=Text(Point(150,200),"Hello User!")
    word.setStyle("bold")
    word.setSize(36)

    word.draw(desktop)
    """

    """
    box=Rectangle(Point(150,600),Point(450,60))
    box.setFill("red")

    box.draw(desktop)
    """







    label=Text(Point(150,50),"Movie Rating")
    label.setStyle("bold")
    label.setSize(18)
    label.draw(desktop)

    bottom=Line(Point(100,600),Point(750,600))
    bottom.draw(desktop)


    b1name=Text(Point(175,b1len-10),onestar)
    b1name.draw(desktop)

    bl1=Text(Point(175,610),"0~1")
    bl1.draw(desktop)

    box1=Rectangle(Point(125,600),Point(225,b1len))
    box1.setFill("Pale Violet Red")
    box1.draw(desktop)

    b2name=Text(Point(290,b2len-10),twostar)
    b2name.draw(desktop)

    bl2=Text(Point(290,610),"1~2")
    bl2.draw(desktop)

    box2=Rectangle(Point(240,600),Point(340,b2len))
    box2.setFill("Saddle Brown")
    box2.draw(desktop)


    b3name=Text(Point(405,b3len-10),tristar)
    b3name.draw(desktop)


    bl3=Text(Point(405,610),"2~3")
    bl3.draw(desktop)

    box3=Rectangle(Point(355,600),Point(455,b3len))
    box3.setFill("ForestGreen")
    box3.draw(desktop)

    b4name=Text(Point(520,b4len-10),frstar)
    b4name.draw(desktop)

    bl4=Text(Point(520,610),"3~4")
    bl4.draw(desktop)

    box4=Rectangle(Point(470,600),Point(570,b4len))
    box4.setFill("Deep Sky Blue")
    box4.draw(desktop)

    b5name=Text(Point(635,b5len-10),fivestar)
    b5name.draw(desktop)

    bl5=Text(Point(635,610),"4~5")
    bl5.draw(desktop)

    box5=Rectangle(Point(585,600),Point(685,b5len))
    box5.setFill("Violet")
    box5.draw(desktop)






    desktop.getMouse()

    desktop.close()
    
except GraphicsError:
    pass
except:
    print("Some Error Occured")