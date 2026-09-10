// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen1491Service {

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
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 161 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 5166 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 3145 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 964 }
    /** Derived accessor for priority (generated filler). */
    def computePriority4() { return 3746 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 1727 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 5681 }
    /** Derived accessor for version (generated filler). */
    def computeVersion7() { return 7350 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold8() { return 8621 }
    /** Derived accessor for region (generated filler). */
    def computeRegion9() { return 7740 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice10() { return 1611 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder11() { return 4356 }
    /** Derived accessor for reference (generated filler). */
    def computeReference12() { return 1069 }
    /** Derived accessor for version (generated filler). */
    def computeVersion13() { return 6020 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn14() { return 9132 }
    /** Derived accessor for category (generated filler). */
    def computeCategory15() { return 5068 }
    /** Derived accessor for priority (generated filler). */
    def computePriority16() { return 8045 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName17() { return 2724 }
    /** Derived accessor for label (generated filler). */
    def computeLabel18() { return 4140 }
    /** Derived accessor for code (generated filler). */
    def computeCode19() { return 4486 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage20() { return 2024 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency21() { return 4109 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity22() { return 3042 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName23() { return 7907 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg24() { return 5574 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName25() { return 7750 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount26() { return 9659 }
    /** Derived accessor for description (generated filler). */
}
