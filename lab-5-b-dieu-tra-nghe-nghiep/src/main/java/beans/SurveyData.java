package beans;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SurveyData {
    private Map<String, SurveyItem> surveys;

    public SurveyData() {
        SurveyItem gv = new SurveyItem("giao_vien", "Giao Vien", 0);
        SurveyItem bs = new SurveyItem("bac_si", "Bac Si", 0);
        SurveyItem dn = new SurveyItem("doanh_nhan", "Doanh Nhan", 0);
        SurveyItem kts = new SurveyItem("kien_truc_su", "Kien Truc Su", 0);
        SurveyItem ns = new SurveyItem("nhac_si", "Nhac Si", 0);
        SurveyItem cs = new SurveyItem("ca_si", "Ca Si", 0);
        surveys = new HashMap<String, SurveyItem>();
        surveys.put(gv.getName(), gv);
        surveys.put(bs.getName(), bs);
        surveys.put(dn.getName(), dn);
        surveys.put(kts.getName(), kts);
        surveys.put(ns.getName(), ns);
        surveys.put(cs.getName(), cs);
    }

    // Tính tổng số người tham gia bình chọn
    public int getToTal() {
        int total = 0;
        for (SurveyItem item : surveys.values()) {
            total += item.getVoteQuantity();
        }
        return total;
    }

    // Tính tỉ lệ phần trăm người dùng yêu thích ngành nghề job
    public double getPercent(String job) {
        double result = 0;
        int total = getToTal();
        if (total == 0) return 0;
        SurveyItem item = surveys.get(job);
        if (item == null) return 0;
        result = ((double) item.getVoteQuantity() / total) * 100;
        return result;
    }

    public void increasingValue(String job) {
        surveys.get(job).increaseVote();
    }

    public Collection<SurveyItem> getSurveyItems() {
        return surveys.values();
    }

    public String getDescription(String job) {
        return surveys.get(job).getDescription();
    }
}
