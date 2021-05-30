package stream;


public class Count {
    private Integer storeId;

    private Integer couponId;

    private Integer couponType;

    private Integer num;

    public Count setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public Count setCouponId(Integer couponId) {
        this.couponId = couponId;
        return this;
    }

    public Count setCouponType(Integer couponType) {
        this.couponType = couponType;
        return this;
    }

    public Count setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Count{" +
                "storeId=" + storeId +
                ", couponId=" + couponId +
                ", couponType=" + couponType +
                ", num=" + num +
                '}';
    }
}
