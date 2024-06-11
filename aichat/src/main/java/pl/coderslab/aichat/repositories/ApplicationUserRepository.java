package pl.coderslab.aichat.repositories;

import org.springframework.data.jpa.repository.*;
import pl.coderslab.aichat.entities.*;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
}
