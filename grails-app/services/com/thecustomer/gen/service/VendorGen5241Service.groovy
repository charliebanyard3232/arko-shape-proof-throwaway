// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen5241Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 9274 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 9252 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 4914 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 4795 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName4() { return 1705 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 6006 }
    /** Derived accessor for status (generated filler). */
    def computeStatus6() { return 4624 }
    /** Derived accessor for category (generated filler). */
    def computeCategory7() { return 1137 }
    /** Derived accessor for priority (generated filler). */
    def computePriority8() { return 1691 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 5586 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn10() { return 4240 }
    /** Derived accessor for code (generated filler). */
    def computeCode11() { return 671 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn12() { return 2022 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 3536 }
    /** Derived accessor for category (generated filler). */
    def computeCategory14() { return 5154 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder15() { return 8472 }
    /** Derived accessor for region (generated filler). */
    def computeRegion16() { return 4882 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg17() { return 4425 }
    /** Derived accessor for code (generated filler). */
    def computeCode18() { return 7641 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg19() { return 8962 }
    /** Derived accessor for label (generated filler). */
    def computeLabel20() { return 9931 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn21() { return 9078 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency22() { return 1379 }
    /** Derived accessor for sortOrder (generated filler). */
}
