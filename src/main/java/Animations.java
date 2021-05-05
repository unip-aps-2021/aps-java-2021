import javafx.scene.control.*;

public class Animations {

    public void sliderAnimation(Control btn, String side, double startPosition, int limitPosition) {
            switch (side){
                case "Left":
                    if (btn.isHover()) {
                        if (btn.getTranslateX() >= startPosition - limitPosition)
                            btn.setTranslateX(btn.getTranslateX() - 4);
                    }else{
                        if (btn.getTranslateX() < startPosition)
                            btn.setTranslateX(btn.getTranslateX() + 4);
                    }
                    break;
                case "Right":
                    if (btn.isHover()) {
                        if (btn.getTranslateX() <= startPosition + limitPosition)
                            btn.setTranslateX(btn.getTranslateX() + 4);
                    }else {
                        if (btn.getTranslateX() > startPosition)
                            btn.setTranslateX(btn.getTranslateX() - 4);
                    }
                    break;
                case "Up":
                    if (btn.isHover()) {
                        if (btn.getTranslateY() >= startPosition - limitPosition) {
                            btn.setTranslateY(btn.getTranslateY() - 4);
                        }
                    }else {
                            if (btn.getTranslateY() < startPosition) {
                            btn.setTranslateY(btn.getTranslateY() + 4);
                        }
                    }
                    break;
                case "Down":
                    if (btn.isHover()) {
                        if (btn.getTranslateY() <= startPosition + limitPosition) {
                            btn.setTranslateY(btn.getTranslateY() + 4);
                        }
                    }else {
                        if (btn.getTranslateY() > startPosition) {
                            btn.setTranslateY(btn.getTranslateY() - 4);
                        }
                    }
                    break;
            }
        }
    }
