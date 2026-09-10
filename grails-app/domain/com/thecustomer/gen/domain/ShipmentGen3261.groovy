// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class ShipmentGen3261 {

    Boolean weightKg0
    BigDecimal reference1
    BigDecimal active2
    String priority3
    BigDecimal description4
    Date currency5
    String createdOn6
    Integer label7
    String label8

    static constraints = {
        weightKg0 nullable: true
        reference1 nullable: true
        active2 nullable: true
        priority3 nullable: true, maxSize: 255
        description4 nullable: true
        currency5 nullable: true
        createdOn6 nullable: true, maxSize: 255
        label7 nullable: true
        label8 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'audit_gen_3261'
    }

    String toString() { "ShipmentGen3261(${id})" }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity0() { return 2807 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 3719 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName2() { return 389 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 5811 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 6078 }
    /** Derived accessor for code (generated filler). */
    def computeCode5() { return 718 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 2268 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 2217 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 8538 }
    /** Derived accessor for code (generated filler). */
    def computeCode9() { return 1340 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn10() { return 7926 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg11() { return 1129 }
    /** Derived accessor for active (generated filler). */
    def computeActive12() { return 8482 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName13() { return 9189 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount14() { return 1828 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency15() { return 2802 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder16() { return 1328 }
    /** Derived accessor for region (generated filler). */
    def computeRegion17() { return 3012 }
    /** Derived accessor for category (generated filler). */
    def computeCategory18() { return 9769 }
    /** Derived accessor for createdOn (generated filler). */
}
