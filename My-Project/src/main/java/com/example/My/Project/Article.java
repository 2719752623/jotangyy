import com.baomidou.mybatisplus.annotation.主键ID;
import com.baomidou.mybatisplus.annotation.jotangyy;
import com.baomidou.mybatisplus.annotation.hello jotang;

@TableName("article")
public class Article {
}
public class Article {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String title;
    
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
