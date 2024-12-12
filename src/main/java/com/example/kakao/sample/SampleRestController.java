package com.example.kakao.sample;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api") 
public class SampleRestController {

    private final SampleDataRepository sampleDataRepository;

    @GetMapping("/test")
    public ResponseEntity<?> pingTest() {
        return ResponseEntity.ok(true);
    }

    @GetMapping("/db")
    public ResponseEntity<?> dbTest() {
        List<SampleData> sampleDataList = sampleDataRepository.findAll();
        return ResponseEntity.ok(sampleDataList);
    }
    
    @GetMapping("/json-data")
    public String getJsonData() {
    	 String jsonData = "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"김철수\",\n" +
                "    \"phone_number\": \"010-1234-5678\",\n" +
                "    \"bookmarks\": [\n" +
                "      {\n" +
                "        \"location_name\": \"한라산 등산로 입구\",\n" +
                "        \"longitude\": \"126.533008\",\n" +
                "        \"latitude\": \"33.361667\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"location_name\": \"성산일출봉\",\n" +
                "        \"longitude\": \"126.930418\",\n" +
                "        \"latitude\": \"33.458598\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"location_name\": \"중문 관광단지\",\n" +
                "        \"longitude\": \"126.409244\",\n" +
                "        \"latitude\": \"33.248778\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"location_name\": \"협재 해수욕장\",\n" +
                "        \"longitude\": \"126.239964\",\n" +
                "        \"latitude\": \"33.394632\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"location_name\": \"제주 민속촌\",\n" +
                "        \"longitude\": \"126.837572\",\n" +
                "        \"latitude\": \"33.431690\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"location_name\": \"제주 돌문화공원\",\n" +
                "        \"longitude\": \"126.673676\",\n" +
                "        \"latitude\": \"33.445062\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"박영희\",\n" +
                "    \"phone_number\": \"010-9876-5432\",\n" +
                "    \"bookmarks\": [\n" +
                "      {\n" +
                "        \"location_name\": \"한림공원\",\n" +
                "        \"longitude\": \"126.264606\",\n" +
                "        \"latitude\": \"33.396131\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"location_name\": \"오설록 티 뮤지엄\",\n" +
                "        \"longitude\": \"126.289416\",\n" +
                "        \"latitude\": \"33.305493\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"location_name\": \"제주 세계자연유산센터\",\n" +
                "        \"longitude\": \"126.886589\",\n" +
                "        \"latitude\": \"33.460651\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"location_name\": \"곽지 해수욕장\",\n" +
                "        \"longitude\": \"126.239655\",\n" +
                "        \"latitude\": \"33.418384\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"location_name\": \"천지연 폭포\",\n" +
                "        \"longitude\": \"126.554874\",\n" +
                "        \"latitude\": \"33.244857\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"location_name\": \"이중섭 미술관\",\n" +
                "        \"longitude\": \"126.563981\",\n" +
                "        \"latitude\": \"33.243157\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";

        return jsonData;
    }
}
