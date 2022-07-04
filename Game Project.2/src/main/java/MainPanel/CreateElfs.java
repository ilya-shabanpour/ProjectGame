package MainPanel;

import Heros.Elfs.NormalElf;
import Heros.Elfs.StrongElf;
import Heros.Elfs.WeakElf;
import javafx.scene.image.ImageView;

abstract public class CreateElfs
{
    private static ImageView Elf_Pic1;
    private static ImageView Elf_Pic2;
    private static ImageView Elf_Pic3;

    private static int Elf1Counter = 0;
    private static int Elf2Counter = 0;
    private static int Elf3Counter = 0;

    public static StrongElf CreateElf1()
    {
        StrongElf strongElf = new StrongElf();
        Elf_Pic1 = (new ImageView(strongElf));

        int randPosition = RandomNumber.RandomNum();

        if (randPosition == 1)
        {
            Elf_Pic1.setLayoutX(620);
            Elf_Pic1.setLayoutY(40);
        }
        else if (randPosition == 2)
        {
            Elf_Pic1.setLayoutX(620);
            Elf_Pic1.setLayoutY(180);
        }
        else if (randPosition == 3)
        {
            Elf_Pic1.setLayoutX(620);
            Elf_Pic1.setLayoutY(320);
        }
        Elf_Pic1.setFitWidth(250);
        Elf_Pic1.setFitHeight(200);
        Game.gamePane.getChildren().add(Elf_Pic1);
        Elf1Counter++;
        return strongElf;
    }
    public static NormalElf CreateElf2()
    {
        NormalElf normalElf = new NormalElf();
        Elf_Pic2 = new ImageView(normalElf);

        int randPosition = RandomNumber.RandomNum();

        if (randPosition == 1)
        {
            Elf_Pic2.setLayoutX(620);
            Elf_Pic2.setLayoutY(40);
        }
        else if (randPosition == 2)
        {
            Elf_Pic2.setLayoutX(620);
            Elf_Pic2.setLayoutY(180);
        }
        else if (randPosition == 3)
        {
            Elf_Pic2.setLayoutX(620);
            Elf_Pic2.setLayoutY(320);
        }
        Elf_Pic2.setFitWidth(250);
        Elf_Pic2.setFitHeight(200);
        Game.gamePane.getChildren().add(Elf_Pic2);
        Elf2Counter++;
        return normalElf;
    }
    public static WeakElf CreateElf3()
    {
        WeakElf weakElf = new WeakElf();
        Elf_Pic3 = new ImageView(weakElf);

        int randPosition = RandomNumber.RandomNum();

        if (randPosition == 1)
        {
            Elf_Pic3.setLayoutX(620);
            Elf_Pic3.setLayoutY(40);
        }
        else if (randPosition == 2)
        {
            Elf_Pic3.setLayoutX(620);
            Elf_Pic3.setLayoutY(180);
        }
        else if (randPosition == 3)
        {
            Elf_Pic3.setLayoutX(620);
            Elf_Pic3.setLayoutY(320);
        }
        Elf_Pic3.setFitWidth(250);
        Elf_Pic3.setFitHeight(200);
        Game.gamePane.getChildren().add(Elf_Pic3);
        Elf3Counter++;
        return weakElf;
    }
}
