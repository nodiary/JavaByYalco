package sec05.chap06.ex01;

import sec05.chap05.ex02.Button;
import sec05.chap05.ex02.ShutDownButton;
import sec05.chap05.ex02.ToggleButton;

public class Main {

    public static void main(String[] args) {
        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button btn : buttons) {
            if (btn instanceof ShutDownButton) continue; // ⭐️
            btn.func();
        }
    }

}
