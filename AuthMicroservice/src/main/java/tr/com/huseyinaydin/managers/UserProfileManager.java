package tr.com.huseyinaydin.managers;

import tr.com.huseyinaydin.dtos.requests.CreateUserRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static tr.com.huseyinaydin.configs.RestApis.CREATE_USER;

@FeignClient(url = "http://34.163.23.81:8181/dev/v1/user-profile", name = "userProfileManager")
public interface UserProfileManager {

    @PostMapping(CREATE_USER)
    ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDTO dto);
}