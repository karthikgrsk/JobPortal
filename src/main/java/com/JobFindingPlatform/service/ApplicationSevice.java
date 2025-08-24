import com.JobFindingPlatform.entity.Application;
import com.JobFindingPlatform.dto.ApplicationsDTO;
import com.JobFindingPlatform.repository.ApplicationRepository;

@Service
@RequiredArgsConstructor
public class ApplicationService{
    private final ApplicationRepository applicationRepository;
}