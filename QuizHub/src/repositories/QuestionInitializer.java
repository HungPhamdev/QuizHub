/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

/**
 *
 * @author ADMIN
 */
import java.util.HashMap;
import java.util.Map;

public class QuestionInitializer {
    
    public static Map<String, String[]> initializeQuestions() {
        Map<String, String[]> questionsMap = new HashMap<>();
        
        // Câu hỏi Toán
        questionsMap.put("Toán", new String[]{
            "2 + 2 bằng bao nhiêu?", 
            "10 / 2 bằng bao nhiêu?", 
            "Căn bậc hai của 16 là gì?",
            "Tổng của 3 và 7 là bao nhiêu?",
            "5 x 6 bằng bao nhiêu?"
        });

        // Câu hỏi Tiếng Anh
        questionsMap.put("Tiếng Anh", new String[]{
            "Từ đồng nghĩa với 'happy' là gì?", 
            "Từ trái nghĩa với 'big' là gì?",
            "Danh từ là gì?",
            "Từ nào là một động từ?",
            "Từ nào là một trạng từ?"
        });

        // Câu hỏi Vật Lý
        questionsMap.put("Vật Lý", new String[]{
            "Tốc độ ánh sáng là bao nhiêu?", 
            "Định luật đầu tiên của Newton là gì?",
            "Đơn vị của lực là gì?",
            "Năng lượng không thể được tạo ra hay tiêu diệt là định luật nào?",
            "Thế nào là động lượng?"
        });

        return questionsMap;
    }
    
    public static Map<String, String[][]> initializeOptions() {
        Map<String, String[][]> optionsMap = new HashMap<>();
        
        // Options for Math
        optionsMap.put("Toán", new String[][]{
            {"4", "3", "2", "1"},
            {"10", "5", "3", "2"},
            {"2", "4", "6", "8"},
            {"8", "7", "9", "10"},
            {"30", "28", "32", "25"}
        });
        
        // Options for English
        optionsMap.put("Tiếng Anh", new String[][]{
            {"Sad", "Joyful", "Angry", "Funny"},
            {"Small", "Huge", "Tiny", "Large"},
            {"An action", "A place", "A thing or person", "A description"},
            {"Run", "Beautiful", "Quickly", "Happiness"},
            {"Quick", "Quickly", "Quiet", "Joy"}
        });

        // Options for Physics
        optionsMap.put("Vật Lý", new String[][]{
            {"300,000 km/s", "150,000 km/s", "500,000 km/s", "1,000 km/s"},
            {"Inertia", "Gravity", "Relativity", "Energy"},
            {"Joule", "Newton", "Watt", "Pascal"},
            {"Định luật bảo toàn năng lượng", "Định luật bảo toàn động lượng", "Định luật hấp dẫn", "Định luật biến thiên"},
            {"Khối lượng nhân vận tốc", "Vận tốc nhân thời gian", "Lực nhân thời gian", "Năng lượng nhân khối lượng"}
        });

        return optionsMap;
    }
    
    public static Map<String, int[]> initializeCorrectAnswers() {
        Map<String, int[]> correctAnswersMap = new HashMap<>();
        
        // Correct answers for Math
        correctAnswersMap.put("Toán", new int[]{0, 1, 1, 0, 0});
        
        // Correct answers for English
        correctAnswersMap.put("Tiếng Anh", new int[]{1, 0, 2, 0, 1});
        
        // Correct answers for Physics
        correctAnswersMap.put("Vật Lý", new int[]{0, 0, 1, 0, 0});
        
        return correctAnswersMap;
    }
}

