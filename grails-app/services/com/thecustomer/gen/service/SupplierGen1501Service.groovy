// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen1501Service {

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
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 8974 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount1() { return 2214 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName2() { return 1815 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 264 }
    /** Derived accessor for active (generated filler). */
    def computeActive4() { return 7583 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 7911 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 3572 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 2489 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 3135 }
    /** Derived accessor for description (generated filler). */
    def computeDescription9() { return 5457 }
    /** Derived accessor for description (generated filler). */
    def computeDescription10() { return 6934 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg11() { return 7064 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence12() { return 8320 }
    /** Derived accessor for version (generated filler). */
    def computeVersion13() { return 2120 }
    /** Derived accessor for category (generated filler). */
    def computeCategory14() { return 9951 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity15() { return 9233 }
    /** Derived accessor for version (generated filler). */
    def computeVersion16() { return 9431 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency17() { return 8001 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId18() { return 2231 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId19() { return 1843 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold20() { return 4952 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName21() { return 2042 }
    /** Derived accessor for description (generated filler). */
    def computeDescription22() { return 8170 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency23() { return 4486 }
    /** Derived accessor for label (generated filler). */
    def computeLabel24() { return 1574 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName25() { return 2397 }
    /** Derived accessor for status (generated filler). */
    def computeStatus26() { return 2038 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount27() { return 6988 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount28() { return 7727 }
    /** Derived accessor for percentage (generated filler). */
}
