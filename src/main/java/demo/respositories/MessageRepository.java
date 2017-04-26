package demo.respositories;

import demo.MessagePOJO;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bipin on 4/25/2017.
 */
public interface MessageRepository extends CrudRepository<MessagePOJO, Integer> {
}
