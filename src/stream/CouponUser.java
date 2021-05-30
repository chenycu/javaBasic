package stream;

public class CouponUser {

    private Integer storeId;

    private Integer couponId;

    private Integer uid;

    private Integer countType;

    public Integer getStoreId() {
        return storeId;
    }

    public CouponUser setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public CouponUser setCouponId(Integer couponId) {
        this.couponId = couponId;
        return this;
    }

    public Integer getUid() {
        return uid;
    }

    public CouponUser setUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    public Integer getCountType() {
        return countType;
    }

    public CouponUser setCountType(Integer countType) {
        this.countType = countType;
        return this;
    }
}
