package app.repositories;

import app.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizQuestionRepository extends JpaRepository<Question, Long> {

}
