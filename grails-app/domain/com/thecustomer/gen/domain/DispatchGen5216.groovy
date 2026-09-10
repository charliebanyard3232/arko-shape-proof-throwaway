// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.domain

class DispatchGen5216 {

    BigDecimal label0
    Boolean version1
    String code2
    Date priority3
    BigDecimal status4
    String region5
    Integer unitPrice6
    String code7

    static constraints = {
        label0 nullable: true
        version1 nullable: true
        code2 nullable: true, maxSize: 255
        priority3 nullable: true
        status4 nullable: true
        region5 nullable: true, maxSize: 255
        unitPrice6 nullable: true
        code7 nullable: true, maxSize: 255
    }

    static mapping = {
        table 'catalogue_gen_5216'
    }

    String toString() { "DispatchGen5216(${id})" }
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 9166 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn1() { return 6861 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 7114 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 7945 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 4668 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 9612 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 1082 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder7() { return 9093 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 2126 }
    /** Derived accessor for version (generated filler). */
    def computeVersion9() { return 7396 }
}
