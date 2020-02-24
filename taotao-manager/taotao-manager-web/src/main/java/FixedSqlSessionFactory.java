import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

import java.io.IOException;

/**
 * Create by 陈刀仔 at 20:35 on 2020/2/23
 */
public class FixedSqlSessionFactory extends SqlSessionFactoryBean {
    @Override
    protected SqlSessionFactory buildSqlSessionFactory() throws IOException {
        try {
            return super.buildSqlSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ErrorContext.instance().reset();
        }
        return null;
    }

}
