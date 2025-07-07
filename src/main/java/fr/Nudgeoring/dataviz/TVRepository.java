package fr.Nudgeoring.dataviz;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import java.util.List;

public interface TVRepository extends ElasticsearchRepository<TV, String> {
    List<TV> findByMarque(String marque);
}
