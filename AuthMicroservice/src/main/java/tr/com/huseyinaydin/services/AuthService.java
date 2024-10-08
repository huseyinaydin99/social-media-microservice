package tr.com.huseyinaydin.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dtos.requests.CreateUserRequestDTO;
import tr.com.huseyinaydin.dtos.requests.RegisterRequestDTO;
import tr.com.huseyinaydin.dtos.responses.LoginResponseDTO;
import tr.com.huseyinaydin.entities.Auth;
import tr.com.huseyinaydin.managers.UserProfileManager;
import tr.com.huseyinaydin.repositories.AuthRepository;

@Service
@RequiredArgsConstructor //tüm argumanlar için zorunlu parametreli yapıcı metot.
public class AuthService {
    private final AuthRepository repository;
    private final UserProfileManager userProfileManager;

    public Auth register(RegisterRequestDTO dto) {
        Auth auth = repository.save(Auth.builder()
                .userName(dto.getUserName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build());

        userProfileManager.createUser(CreateUserRequestDTO.builder() //bu noktada UserMicroservice'e istek atılıyor ancak normal metot çağırır gibi.
                .authId(auth.getId())
                .email(auth.getEmail())
                .username(auth.getUserName())
                .build());
        return auth;
    }

    public boolean login(LoginResponseDTO dto) {
        return repository.existsByUserNameAndPassword(dto.getUserName(),dto.getPassword());
    }
}