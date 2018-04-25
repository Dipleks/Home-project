package impruveEnglish.control;

import impruveEnglish.effects.EffectColorOpacity;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

class SliderMenu implements Root
{
    static Slider getSliderOpacityClassic(){
        Slider slider = new Slider();
        slider.setTranslateX(widthSize/2.5);
        slider.setTranslateY(heightSize/2.7);
        slider.setMaxWidth(100);
        slider.setMin(0.3);
        slider.setMax(1.0);
//        slider.setShowTickLabels(true);
//        slider.setShowTickMarks(true);
        slider.setValue(0.5);
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)
            {
                STACK_PANE.setBackground(new Background(new BackgroundFill(Color.rgb(0, 100, 100, (Double) newValue),
                        CornerRadii.EMPTY, new Insets(50,50,50,50))));
            }
        });
        return slider;
    }
    static Slider getSliderOpacityWHITE(){
        Slider slider = new Slider();
        slider.setTranslateX(widthSize/2.5);
        slider.setTranslateY(heightSize/2.7);
        slider.setMaxWidth(100);
        slider.setMin(0.3);
        slider.setMax(1.0);
//        slider.setShowTickLabels(true);
//        slider.setShowTickMarks(true);
        slider.setValue(0.5);
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)
            {
                STACK_PANE.setBackground(new Background(new BackgroundFill(Color.web(EffectColorOpacity.WHITE_PANEL, (Double) newValue),
                        CornerRadii.EMPTY, new Insets(50,50,50,50))));
            }
        });
        return slider;
    }
    static Slider getSliderOpacityBLACK(){
        Slider slider = new Slider();
        slider.setTranslateX(widthSize/2.5);
        slider.setTranslateY(heightSize/2.7);
        slider.setMaxWidth(100);
        slider.setMin(0.3);
        slider.setMax(1.0);
//        slider.tu
//        slider.setShowTickLabels(true);
//        slider.setShowTickMarks(true);
        slider.setValue(0.5);
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)
            {
                STACK_PANE.setBackground(new Background(new BackgroundFill(Color.web(EffectColorOpacity.BLACK_PANEL, (Double) newValue),
                        CornerRadii.EMPTY, new Insets(50,50,50,50))));
            }
        });
        return slider;
    }
}
