package comflower.sagongsa.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
@Schema(description = "댓글 생성 DTO")
public class CreateCommentDTO {
    @NotBlank
    @Schema(description = "댓글 내용", example = "댓글 내용")
    private String content;
    @Schema(description = "부모 댓글 ID", example = "1")
    private Long parentId;
}
