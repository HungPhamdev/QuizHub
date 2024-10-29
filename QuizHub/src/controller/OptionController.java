package controller;

import java.util.List;
import model.Option;
import services.OptionService;

public class OptionController {

    private OptionService optionService;

    public OptionController() {
        this.optionService = new OptionService();
    }

    public int addOption(Option option) {
        return optionService.createOption(option);
    }

    public int modifyOption(Option option) {
        return optionService.updateOption(option);
    }

    public List<Option> listOptions() {
        return optionService.getAllOptions();
    }

    public int removeOption(int OptionId) {
        return optionService.deleteOption(OptionId);
    }

    public boolean isContentExists(String content) {
        return optionService.isContentExists(content);
    }
}
