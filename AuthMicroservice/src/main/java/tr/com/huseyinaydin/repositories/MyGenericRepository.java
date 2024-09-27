package tr.com.huseyinaydin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean //Spring IoC Container'de bu interface'den bir instance yaratmasın dipnotu.
public interface MyGenericRepository<T, ID> extends JpaRepository<T, ID> {

}