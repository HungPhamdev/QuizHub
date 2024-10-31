package services;

import java.util.List;
import model.Option;
import repositories.OptionRepository;

public class OptionService {

    private OptionRepository optionRepository;

    public OptionService() {
        this.optionRepository = new OptionRepository();
    }

    public int createOption(Option option) {
        return optionRepository.createOption(option);
    }

    public int updateOption(Option option) {
        return optionRepository.updateOption(option);
    }

    public List<Option> getAllOptions() {
        return optionRepository.getAllOptions();
    }

    public int deleteOption(int OptionId) {
        return optionRepository.deleteOption(OptionId);
    }

    public boolean isContentExists(String content) {
        return optionRepository.isContentExists(content);
    }
    
    public String findContentById(int id){
        return optionRepository.findContentById(id);
    }
}
