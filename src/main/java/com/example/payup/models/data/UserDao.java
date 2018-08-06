import java.util.List;



@Repository

@Transactional

public interface UserDao extends CrudRepository<User, Integer> {



    public List<User> findByUsername(String username);


    void save(User user);
}
