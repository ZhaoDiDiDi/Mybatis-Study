import com.it.dao.UserMapper;
import com.it.pojo.User;
import com.it.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;

public class MyTest {
    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user1 = mapper.getUserById(1);
        System.out.println(user1);

        mapper.upDataUser(new User(1,"猪八戒","9999999999"));

        User user2 = mapper.getUserById(1);
        System.out.println(user2);

        System.out.println(user1==user2);
        sqlSession.close();
    }
}
