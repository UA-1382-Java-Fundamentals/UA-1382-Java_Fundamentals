package softserve.academy.edu10.taskPractical1;

import java.util.List;

public class HeavyBoxHandler {
    public void removeBox(List<HeavyBox> boxList, int index) {
        boxList.remove(index);
    }

    public void setBoxWeight(List<HeavyBox> boxList, int index, int weight) {
        boxList.get(index).setWeight(weight);
    }

    public void clearBoxList(List<HeavyBox> boxList) {
        boxList.clear();
    }
}
