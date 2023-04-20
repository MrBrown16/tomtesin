package control;
import javafx.scene.control.Button;
import model.MainModel;
import view.MainView;

public class MainControl{
    MainView mainView;
    MainModel mainModel;

    public MainControl() {
        this.mainView = new MainView();
        this.mainModel = new MainModel();
        this.handleEvent();
    }

    public MainView getMainView() {
        return mainView;
    }

    private void handleEvent(){
        Button calcButton = this.mainView.getButtonPanel().getCalcButton();

        calcButton.setOnAction( e -> onClickCalcButton() );
    }

    private void onClickCalcButton(){
        String weightStr = this.mainView.getWeightPanel().getValue();
        String heightStr = this.mainView.getHeightPanel().getValue();
        double weight = Double.parseDouble(weightStr);
        double height = Double.parseDouble(heightStr);
        Double bodyweight = mainModel.calcBodyWeight(weight, height);
        String bodyweightStr = bodyweight.toString();
        
        this.mainView.getBodyWeightPanel().setValue(bodyweightStr);
    }
}
